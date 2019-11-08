package com.gigaspaces

import org.insightedge.scala.annotation.SpaceId
import org.slf4j.Logger

import scala.beans.{BeanProperty, BooleanBeanProperty}
import scala.util.Random


class SpacePersistApp {


}
case class Product(
                    @BeanProperty @SpaceId var id: Long,
                    @BeanProperty var description: String,
                    @BeanProperty var quantity: Int,
                    @BooleanBeanProperty var featuredProduct: Boolean
                  ) {
  def this() = this(-1, null, -1, false)
}

object SpacePersistApp {

  def main(args: Array[String]): Unit = {
    val space=new SpaceConfig().getGigaSpace
    val i:Long=2
     val p2= new ProductV1("2", "productOne")
    //val p1= Product(i, "Description of product " + i, Random.nextInt(10), Random.nextBoolean())
    space.write(p2)
    //space.write(p1)

    val out=space.readById(p2.getClass(),"2")
    println(out)
  }

}
