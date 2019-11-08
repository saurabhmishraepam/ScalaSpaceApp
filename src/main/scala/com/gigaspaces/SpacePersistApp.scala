package com.gigaspaces

import com.gigaspaces.config.SpaceConfig

class SpacePersistApp {

}
object SpacePersistApp {
  def main(args: Array[String]): Unit = {
    val space=new SpaceConfig().getGigaSpace
    val p2= new ProductV1("4", "productOne")
    space.write(p2)
    val out=space.readById(p2.getClass(),"3")
    println(out)
  }
}
