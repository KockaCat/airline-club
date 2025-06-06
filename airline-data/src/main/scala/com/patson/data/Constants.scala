package com.patson.data

import com.typesafe.config.ConfigFactory

object Constants {
  val CYCLE_TABLE = "cycle"
  val CITY_TABLE = "city"
  val AIRPORT_TABLE = "airport"
  val AIRPORT_INDEX_1 = "airport_index_1"
  val AIRPORT_CITY_SHARE_INDEX_1 = "airport_city_index_1"
  val AIRPORT_CITY_SHARE_INDEX_2 = "airport_city_index_2"
  val AIRPORT_CITY_SHARE_TABLE = "airport_city"
  val AIRPORT_FEATURE_TABLE = "airport_feature"
  val AIRPORT_FEATURE_INDEX_1 = "airport_feature_index_1"
  val AIRPORT_IMAGE_TABLE = "airport_image"
  val AIRPORT_AIRLINE_APPEAL_BONUS_TABLE = "airport_airline_appeal_bonus"
  val AIRPORT_AIRLINE_APPEAL_BONUS_INDEX_1 =  "airport_airline_appeal_bonus_index_1"
  val AIRPORT_RUNWAY_TABLE = "airport_runway"
  val AIRPORT_CHAMPION_TABLE = "airport_champion"

  val COUNTRY_TABLE = "country"
  val COUNTRY_AIRLINE_RELATIONSHIP_TABLE = "country_airline_relationship"
  val COUNTRY_AIRLINE_RELATIONSHIP_INDEX_1 = "country_airline_relationship_index_1"
  val COUNTRY_AIRLINE_RELATIONSHIP_INDEX_2 = "country_airline_relationship_index_2"
  val COUNTRY_MUTUAL_RELATIONSHIP_TABLE = "country_mutual_relationship"
  val COUNTRY_MARKET_SHARE_TABLE = "country_market_share"
  val COUNTRY_AIRLINE_TITLE_TABLE = "country_airline_title"
  val LINK_TABLE = "link"
  val LINK_INDEX_1 = "link_index_1"
  val LINK_INDEX_2 = "link_index_2"
  val LINK_INDEX_3 = "link_index_3"
  val LINK_INDEX_4 = "link_index_4"
  val LINK_INDEX_5 = "link_index_5"
  val LINK_INDEX_6 = "link_index_6"
  val LINK_CONSUMPTION_TABLE = "link_consumption"
  val LINK_CONSUMPTION_INDEX_1 = "link_consumption_index_1"
  val LINK_CONSUMPTION_INDEX_2 = "link_consumption_index_2"
  val LINK_CONSUMPTION_INDEX_3 = "link_consumption_index_3"
  val LINK_ASSIGNMENT_TABLE = "link_assignment"
  val LINK_ASSIGNMENT_INDEX_1 = "link_assignment_index_1"
  val LINK_ASSIGNMENT_INDEX_2 = "link_assignment_index_2"
  val LINK_STATISTICS_TABLE = "link_statistics"
  val LINK_STATISTICS_INDEX_1 = "link_statistics_index_1"
  val LINK_STATISTICS_INDEX_2 = "link_statistics_index_2"
  val LINK_STATISTICS_INDEX_3 = "link_statistics_index_3"
  val LINK_STATISTICS_INDEX_4 = "link_statistics_index_4"
  val WATCHED_LINK_TABLE = "watched_link"
  val AIRLINE_TABLE = "airline"
  val AIRLINE_INFO_TABLE = "airline_info"
  val AIRLINE_BASE_TABLE = "airline_base"
  val AIRLINE_BASE_INDEX_1 = "airline_base_index_1"
  val AIRLINE_BASE_INDEX_2 = "airline_base_index_2"
  val AIRLINE_BASE_INDEX_3 = "airline_base_index_3"
  val AIRPORT_LOYALTY_TABLE = "loyalty"
  val AIRPORT_ASSET_TABLE = "airport_asset"
  val AIRPORT_ASSET_BLUEPRINT_TABLE = "airport_asset_blueprint"
  val AIRPORT_ASSET_PROPERTY_TABLE = "airport_asset_property"
  val AIRPORT_ASSET_BOOST_TABLE = "airport_asset_boost"
  val AIRPORT_ASSET_PROPERTY_HISTORY_TABLE = "airport_asset_property_history"
  val AIRPORT_ASSET_BOOST_HISTORY_TABLE = "airport_asset_boost_history"
  val DESTINATIONS_TABLE = "destinations"

  val AIRLINE_APPEAL_TABLE = "airline_appeal"
  val AIRLINE_APPEAL_INDEX_1 = "airline_appeal_index_1"
  val AIRLINE_APPEAL_INDEX_2 = "airline_appeal_index_2"
  val AIRLINE_TRANSACTION_TABLE = "airline_transaction"
  val AIRLINE_TRANSACTION_INDEX_1 = "airline_transaction_index_1"
  val AIRLINE_TRANSACTION_INDEX_2 = "airline_transaction_index_2"
  val AIRLINE_CASH_FLOW_ITEM_TABLE = "airline_cash_flow_item"
  val AIRLINE_BASE_SPECIALIZATION_TABLE = "airline_base_specialization"
  val AIRLINE_BASE_SPECIALIZATION_LAST_UPDATE_TABLE = "airline_base_specialization_last_update"
  val AIRLINE_REPUTATION_BREAKDOWN = "airline_reputation_breakdown"
  val AIRLINE_MODIFIER_TABLE = "airline_modifier"
  val AIRLINE_MODIFIER_INDEX_PREFIX = "airline_modifier_index_"
  val AIRLINE_MODIFIER_PROPERTY_TABLE = "airline_modifier_property"

  val AIRLINE_STATISTICS_TABLE = "airline_statistics"
  val AIRLINE_OPERATIONS_STRATEGY = "airline_operations_strategy"
  val INCOME_TABLE = "income"
  val CASH_FLOW_TABLE = "cash_flow"
  val AIRLINE_LOGO_TABLE = "airline_logo"
  val AIRLINE_LIVERY_TABLE = "airline_livery"
  val AIRLINE_SLOGAN_TABLE = "airline_slogan"
  val AIRLINE_NAME_HISTORY_TABLE = "airline_name_history"
  val ALLIANCE_TABLE = "alliance"
  val ALLIANCE_MEMBER_TABLE = "alliance_member"
  val ALLIANCE_HISTORY_TABLE = "alliance_history"
  val AIRPLANE_RENEWAL_TABLE = "airline_renewal"
  val AIRPLANE_CONFIGURATION_TABLE = "airplane_configuration"
  val AIRPLANE_CONFIGURATION_TEMPLATE_TABLE = "airplane_configuration_template"
  val AIRPLANE_CONFIGURATION_TEMPLATE_INDEX_1 ="airplane_configuration_template_index_1"
  val AIRPLANE_CONFIGURATION_TEMPLATE_INDEX_2 = "airplane_configuration_template_index_2"
  val LINKS_INCOME_TABLE = "links_income"
  val TRANSACTIONS_INCOME_TABLE = "transactions_income"
  val OTHERS_INCOME_TABLE = "others_income"
  val AIRPLANE_MODEL_TABLE = "airplane_model"
  val AIRPLANE_MODEL_FAVORITE_TABLE = "airplane_model_favorite"
  val AIRPLANE_MODEL_AIRLINE_DISCOUNT_TABLE = "airplane_model_airline_discount"
  val AIRPLANE_MODEL_DISCOUNT_TABLE = "airplane_model_discount"
  val AIRPLANE_TABLE = "airplane"
  val AIRPLANE_INDEX_1 = "airplane_index_1"
  val AIRPLANE_INDEX_2 = "airplane_index_2"
  val USER_TABLE = "user"
  val USER_SECRET_TABLE = "user_secret"
  val USER_MODIFIER_TABLE = "user_modifier"
  val RESET_USER_TABLE = "reset_user"
  val USER_IP_TABLE = "user_ip"
  val BANNED_IP_TABLE = "banned_ip"
  val USER_UUID_TABLE = "user_uuid"
  val USER_AIRLINE_TABLE = "user_airline"
  val VIP_ROUTE_TABLE = "vip_route"
  val VIP_ROUTE_ENTRY_TABLE = "vip_route_entry"
  val PASSENGER_HISTORY_TABLE = "passenger_history"
  val PASSENGER_HISTORY_TABLE_TEMP = "passenger_history_temp"
  val PASSENGER_HISTORY_INDEX_1 = "passenger_history_index_1"
  val PASSENGER_HISTORY_INDEX_2 = "passenger_history_index_2"
  val PASSENGER_HISTORY_INDEX_3 = "passenger_history_index_3"
  val LOAN_TABLE = "loan"
  val LOUNGE_TABLE = "lounge"
  val LOUNGE_CONSUMPTION_TABLE = "lounge_consumption"
  val SHUTTLE_SERVICE_TABLE = "shuttle_service"
  val OIL_CONTRACT_TABLE = "oil_contract"
  val OIL_PRICE_TABLE = "oil_price"
  val OIL_CONSUMPTION_HISTORY_TABLE = "oil_consumption_history"
  val OIL_INVENTORY_POLICY_TABLE = "oil_inventory_policy"
  val LOAN_INTEREST_RATE_TABLE = "loan_interest_rate"
  val LOG_TABLE = "log"
  val LOG_PROPERTY_TABLE = "log_property"
  val LAST_CHAT_ID_TABLE = "last_chat_id"
  val CHAT_MESSAGE_TABLE = "chat_message"
  val LOG_INDEX_1 = "log_index_1"
  val ALERT_TABLE = "alert"
  val ALERT_INDEX_1 = "alert_index_1"
  val EVENT_TABLE = "event"
  val OLYMPIC_CANDIDATE_TABLE = "olympics_candidate"
  val OLYMPIC_AFFECTED_AIRPORT_TABLE = "olympics_affected_airport"
  val OLYMPIC_AIRLINE_VOTE_TABLE = "olympics_airline_vote"
  val OLYMPIC_VOTE_ROUND_TABLE = "olympics_vote_round"
  val OLYMPIC_COUNTRY_STATS_TABLE = "olympics_country_stats"
  val OLYMPIC_AIRLINE_STATS_TABLE = "olympics_airline_stats"
  val OLYMPIC_AIRLINE_GOAL_TABLE = "olympics_airline_goal"
  val EVENT_PICKED_REWARD_TABLE = "event_picked_reward"
  val LINK_CHANGE_HISTORY_TABLE ="link_change_history"
  val LINK_CHANGE_HISTORY_INDEX_PREFIX = "link_change_index_"
  val GOOGLE_RESOURCE_TABLE ="google_resource"
  val BUSY_DELEGATE_TABLE = "busy_delegate"
  val COUNTRY_DELEGATE_TASK_TABLE = "country_delegate_task"
  val STRATEGY_DELEGATE_TASK_TABLE = "strategy_delegate_task"
  val LINK_NEGOTIATION_TASK_TABLE = "link_negotiation_delegate_task"
  val LINK_NEGOTIATION_COOL_DOWN_TABLE = "link_negotiation_cool_down"
  val LOYALIST_TABLE = "loyalist"
  val LOYALIST_HISTORY_TABLE = "loyalist_history"
  val LOYALIST_HISTORY_INDEX_PREFIX = "loyalist_history_index_"
  val COMPLETED_TUTORIAL_TABLE = "completed_tutorial"
  val COMPLETED_NOTICE_TABLE = "completed_notice"
  val TRACKING_NOTICE_TABLE = "tracking_notice"
  val AIRPORT_ANIMATION_TABLE = "airport_animation"
  val ADMIN_LOG_TABLE = "admin_log"
  val USER_WALLPAPER_TABLE = "user_wallpaper"

  val NOTES_AIRLINE_TABLE = "notes_airline"
  val NOTES_AIRPORT_TABLE = "notes_airport"
  val NOTES_LINK_TABLE = "notes_link"

  val CAMPAIGN_TABLE = "campaign"
  val CAMPAIGN_AREA_TABLE = "campaign_area"
  val CAMPAIGN_DELEGATE_TASK_TABLE = "campaign_delegate_task"

  val ALLIANCE_MISSION_TABLE = "alliance_mission"
  val ALLIANCE_MISSION_PROPERTY_TABLE = "alliance_mission_property"
  val ALLIANCE_MISSION_PROPERTY_HISTORY_TABLE = "alliance_mission_property_history"
  val ALLIANCE_MISSION_REWARD_TABLE = "alliance_mission_reward"
  val ALLIANCE_MISSION_REWARD_PROPERTY_TABLE = "alliance_mission_reward_property"

  val ALLIANCE_STATS_TABLE = "alliance_stats"
  val ALLIANCE_MISSION_STATS_TABLE = "alliance_mission_stats"

  val LINK_NEGOTIATION_DISCOUNT_TABLE = "link_negotiation_discount"

  val ALLIANCE_LABEL_COLOR_BY_ALLIANCE_TABLE = "alliance_label_color_by_alliance"
  val ALLIANCE_LABEL_COLOR_BY_AIRLINE_TABLE = "alliance_label_color_by_airline"


  //Christmas Event
  val SANTA_CLAUS_INFO_TABLE = "santa_claus_info"
  val SANTA_CLAUS_GUESS_TABLE = "santa_claus_guess"

  //  val DATABASE_CONNECTION = "jdbc:sqlite:../airline-data/db/default.db"
  //  val DB_DRIVER = "org.sqlite.JDBC"
  val configFactory = ConfigFactory.load()
  val DB_HOST = if (configFactory.hasPath("mysqldb.host")) configFactory.getString("mysqldb.host") else sys.env.get("DB_HOST").getOrElse("localhost:3306")
  val dbParams = if (configFactory.hasPath("mysqldb.dbParams")) configFactory.getString("mysqldb.dbParams") else ""
  println("!!!!!!!!!!!!!!!DB HOST IS " + DB_HOST)
  val SCHEMA_NAME = if (configFactory.hasPath("mysqldb.schema")) configFactory.getString("mysqldb.schema") else sys.env.get("DB_NAME").getOrElse("airline")

  //val DATABASE_CONNECTION = "jdbc:mysql://" + DB_HOST + "/airline?rewriteBatchedStatements=true&useSSL=false&autoReconnect=true&useUnicode=true&characterEncoding=utf-8"
  val DATABASE_CONNECTION = "jdbc:mysql://" + DB_HOST + "/" + SCHEMA_NAME +"?rewriteBatchedStatements=true&useSSL=false&autoReconnect=true&useUnicode=true&characterEncoding=utf-8&allowPublicKeyRetrieval=true" + dbParams
  // val DATABASE_CONNECTION = "jdbc:mysql://localhost:3306/airline_v2_1?socket=/tmp/mysql_3306.sock?rewriteBatchedStatements=true&useSSL=false&autoReconnect=true&useUnicode=true&characterEncoding=utf-8"
  val DB_DRIVER = "com.mysql.jdbc.Driver"
  val DATABASE_USER = if (configFactory.hasPath("mysqldb.user")) configFactory.getString("mysqldb.user") else sys.env.get("DB_USER").getOrElse("mfc01")
  val DATABASE_PASSWORD = if (configFactory.hasPath("mysqldb.password")) configFactory.getString("mysqldb.password") else sys.env.get("DB_PASSWORD").getOrElse("ghEtmwBdnXYBQH4")

  println(s"!!!!!!!!!!!!!!!FINAL DB str $DATABASE_CONNECTION with user $DATABASE_USER")

}
