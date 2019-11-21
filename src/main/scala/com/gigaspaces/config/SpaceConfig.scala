package com.gigaspaces.config

import java.util.Properties

import org.openspaces.core.space.SpaceProxyConfigurer
import org.openspaces.core.{GigaSpace, GigaSpaceConfigurer}

class SpaceConfig {

  def getGigaSpace : GigaSpace ={

    val url = getClass.getResource("src\\main\\resources\\application.properties")
    val properties: Properties = new Properties()
    val hostName = properties.get("host-name")
    println(hostName)
    val space = new GigaSpaceConfigurer(new SpaceProxyConfigurer("demo").versioned(true)
      .lookupLocators("EPINHYDW0391")).gigaSpace //automatically it connects to localhost
     space
  }

}
