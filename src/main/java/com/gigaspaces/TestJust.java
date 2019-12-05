package com.gigaspaces;

import org.openspaces.core.GigaSpace;
import org.openspaces.core.GigaSpaceConfigurer;
import org.openspaces.core.space.SpaceProxyConfigurer;

public class TestJust {


    public static void main(String [] args){

        GigaSpace gigaSpace = new GigaSpaceConfigurer(new SpaceProxyConfigurer
                ("wanSpaceDE").lookupGroups("xap-15.0.0").lookupLocators("a7939aaca176411ea988302c7a346453-215909573.us-east-2.elb.amazonaws.com:4174")).gigaSpace();

        System.out.println(gigaSpace.getClustered());

    }
}
