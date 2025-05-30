package controllers

import java.nio.file.Path

import com.patson.data.AirlineSource
import javax.imageio.ImageIO

object LogoUtil {
  val logos : scala.collection.mutable.Map[Int, Array[Byte]] = collection.mutable.Map(AirlineSource.loadLogos().toSeq: _*) 
  val blank = getBlankLogo()
  val rat = getRatLogo()
  val imageHeight = 12
  val imageWidth = 24
  
  def getLogo(airlineId : Int) : Array[Byte]= {
    if (airlineId < 30) {
      rat
    } else {
      logos.get(airlineId) match {
        case Some(logo) => logo
        case None => blank
      }
    }
  }
  
  def saveLogo(airlineId : Int, logo : Array[Byte]) = {
    AirlineSource.saveLogo(airlineId, logo)
    logos.put(airlineId, logo) //update cache
  }
  
  def validateUpload(logoFile : Path) : Option[String] = {
    val imageInputStream = ImageIO.createImageInputStream(logoFile.toFile)
    val readers = ImageIO.getImageReaders(imageInputStream)
    if (!readers.hasNext) {
      return Some("Cannot identify image format")
    }
    val reader = readers.next();
    val format = reader.getFormatName
    if (!format.equalsIgnoreCase("png")) {
      return Some(s"Invalid image format: $format")
    }

    val image = ImageIO.read(logoFile.toFile)
    if (image.getHeight() != imageHeight || image.getWidth() != imageWidth) {
      return Some("Image should be " + imageWidth + "px wide and " + imageHeight + "px tall")
    }
    return None
  }
  
  def getBlankLogo() = {
    val is = play.Environment.simple().resourceAsStream("/logo/blank.png")

    val targetArray = new Array[Byte](is.available());
    is.read(targetArray);

    targetArray
  }

  def getRatLogo() = {
    val is = play.Environment.simple().resourceAsStream("/logo/bot-rat-logo.png")

    val targetArray = new Array[Byte](is.available());
    is.read(targetArray);

    targetArray
  }
}