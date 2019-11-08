package com.gigaspaces

import org.openspaces.core.{GigaSpace, GigaSpaceConfigurer}
import org.openspaces.core.space.SpaceProxyConfigurer

class SpaceConfig {

  def getGigaSpace : GigaSpace ={
    val space = new GigaSpaceConfigurer(new SpaceProxyConfigurer("demo").versioned(true)
      .lookupLocators("EPINHYDW0391")).gigaSpace //automatically it connects to localhost
     space
  }

}
