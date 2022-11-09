package com.pro.rev.collection;

import java.util.Map;

public class HashMaps {

    public void maps(){
        Map<Integer,String> map= new java.util.HashMap<>();
        map.put(1,"hello");
        map.put(3,"data");
        map.put(2,"ram");

        map.forEach((k,v)->{
            System.out.println("the key is "+k +" and value are "+v);
        });


/*
        System.out.println(map.entrySet().stream().map(u->u.equals("data")).sorted());
*/



    }

}
