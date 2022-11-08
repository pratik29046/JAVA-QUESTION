package com.pro.rev;

import java.util.Map;

public class BiConsumerInterfaceExample {

    public static void hello(String name, String age){
        System.out.println("my name is"+name+" and age is "+age);
    }



    public static void hello1(Map<Integer, String> map, String s) {
        System.out.println("the map name is "+s);
        map.forEach((key,value)->{
            System.out.println("the key is "+key +" the value is "+value);
        });

    }
}
