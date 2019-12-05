package com.gigaspaces;

import org.openspaces.core.GigaSpace;
import org.openspaces.core.GigaSpaceConfigurer;
import org.openspaces.core.space.SpaceProxyConfigurer;

public class TestJust {


    public static void main(String [] args){

        GigaSpace gigaSpace = new GigaSpaceConfigurer(new SpaceProxyConfigurer
                ("wanSpaceUS").lookupGroups("xap-15.0.0").lookupLocators("a5d95f54d176111eab4970255fbf9aaa-899163231.us-east-2.elb.amazonaws.com:4174")).gigaSpace();

        System.out.println(gigaSpace.getClustered());

    }
}
