package com.patson

import java.util.Calendar
import com.patson.data._
import com.patson.model._
import com.typesafe.config.ConfigFactory

object UserSimulation {
  val LARGE_AIRLINE_PURGE_USER_THRESHOLD = 30 //in days
  val SMALL_AIRLINE_PURGE_USER_THRESHOLD = 30 //in days
  val configFactory = ConfigFactory.load()
  val devMode = if (configFactory.hasPath("dev")) configFactory.getBoolean("dev") else false


  def simulate(cycle: Int) = {
    val strictThreshold = Calendar.getInstance()
    strictThreshold.add(Calendar.DAY_OF_YEAR, -1 * SMALL_AIRLINE_PURGE_USER_THRESHOLD)

    val generousThreshold = Calendar.getInstance()
    generousThreshold.add(Calendar.DAY_OF_YEAR, -1 * LARGE_AIRLINE_PURGE_USER_THRESHOLD)

    if (devMode) {
      println("Not resetting players as it's in dev mode")
    } else {
      println(s"starting resetting strict threshold - active before ${strictThreshold.getTime}; and generous threshold - active before ${generousThreshold.getTime}")
    }

    UserSource.loadUsersByCriteria(List.empty).foreach { user =>
      if (shouldResetPlayer(user, strictThreshold, generousThreshold)) {
        println(s"Resetting user $user with airlines ${user.getAccessibleAirlines()}")
        user.getAccessibleAirlines.foreach { airline =>
          if (airline.airlineType != AirlineType.NON_PLAYER) {
            val resetBalance = Computation.getResetAmount(airline.id).overall
            Airline.resetAirline(airline.id, newBalance = resetBalance) match {
              case Some(airline) =>
                println(s"Airline reset to $airline")
              case None =>
                println(s"Failed to reset airline $airline")
            }
          }
        }

        UserSource.updateUser(user.copy(status = UserStatus.INACTIVE))
      }
    }
  }

  def shouldResetPlayer(user : User, strictThreshold : Calendar, generousThreshold : Calendar): Boolean = {
    if (devMode) {
      return false
    }

    if (user.status != UserStatus.INACTIVE) {
      var hasLargeAirline = false
      user.getAccessibleAirlines().foreach { airline =>
        if (airline.airlineGrade.level >= 150) {
          hasLargeAirline = true
        }
      }
      val threshold = if (hasLargeAirline || user.level > 0) generousThreshold else strictThreshold

      if (user.lastActiveTime.before(threshold)) {
        true
      } else {
        false
      }
    } else {
      false
    }
  }
}
