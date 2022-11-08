package com.pro.rev;

import sun.rmi.runtime.Log;

import java.sql.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class Unique {

    public void uni() {

        String[] arr = {"hello", "how", "what", "hello", "how", "hshs", "hello", "how", "keek", "hello"};
        int len = arr.length;
        String[] arr1 = new String[len];
        int f = 0;
        int occ = 0;
        for (int i = 0; i < len; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i].equals(arr[j])) {
                    flag = 1;
                    occ++;
                    break;
                }
            }
            if (flag == 0) {
                arr1[f] = arr[i];
                f++;

            }

        }

       /* for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i].equals(arr[j]))
                    System.out.println(arr[j]);
            }
        }*/

        for (int i = 0; i < f; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("the occurrence is " + occ);

    }

    public void uni1() {
        String str = "Communication hello hello hello Hello";
        Map<String, Long> result = Arrays.stream(str.split(" ")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);
    }


    public void uni2() {
        String[] strings = {"ram", "hello", "ram", "karan", "hello", "hello"};
        Map<String, Long> map = Arrays.stream(strings).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));


        Map<String, Long> mmap = Arrays.stream(strings).map(String::toLowerCase).collect(Collectors.groupingBy(k -> k, LinkedHashMap::new, Collectors.counting()));

        Map<String, Long> mm1 = Arrays.stream(strings).map(String::toLowerCase).collect(Collectors.groupingBy(k -> k, HashMap::new, Collectors.counting()));

        mm1.forEach((k,v)->{
            System.out.println(k+ "   "+v);
        });

        Arrays.stream(strings).forEach((k)->{
            System.out.println("the value is "+k);

            System.out.println("heellllll");



        });


    }


}



