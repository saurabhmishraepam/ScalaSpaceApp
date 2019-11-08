package com.gigaspaces.config

import org.openspaces.core.space.SpaceProxyConfigurer
import org.openspaces.core.{GigaSpace, GigaSpaceConfigurer}

class SpaceConfig {

  def getGigaSpace : GigaSpace ={
    val space = new GigaSpaceConfigurer(new SpaceProxyConfigurer("demo").versioned(true)
      .lookupLocators("EPINHYDW0391")).gigaSpace //automatically it connects to localhost
     space
  }

}
