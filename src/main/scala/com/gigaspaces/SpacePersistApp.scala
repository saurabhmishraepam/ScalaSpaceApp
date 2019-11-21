package com.gigaspaces

import java.io.{File, FileInputStream}
import java.util.Properties

import com.gigaspaces.config.SpaceConfig

class SpacePersistApp {

}
object SpacePersistApp {
  def main(args: Array[String]): Unit = {
  var configFileName: String ="";
    if (args.length != 0) {
      configFileName = args(0)
      var f = new File(configFileName)
      if (f.exists()) {
        println("found file")
        val properties: Properties = new Properties()
        properties.load(new FileInputStream(f))
        val hostName = properties.get("host-name")
        println(hostName)
      }
    }
    val space=new SpaceConfig().getGigaSpace
    val p2= new ProductV1("4", "productOne")
    space.write(p2)
    val out=space.readById(p2.getClass(),"3")
    println(out)
  }
}
