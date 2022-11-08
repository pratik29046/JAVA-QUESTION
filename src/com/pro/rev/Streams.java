package com.pro.rev;

import com.pro.rev.POJO.Info;

import java.util.*;
import java.util.stream.Collectors;

import com.pro.rev.POJO.UserInfo;

public class Streams {

    public void hello() {

        List<Info> InfosList = new ArrayList<>();
        //Adding Infos
        InfosList.add(new Info(1, "HP Laptop", 25000f));
        InfosList.add(new Info(2, "Dell Laptop", 30000f));
        InfosList.add(new Info(3, "Lenevo Laptop", 28000f));
        InfosList.add(new Info(4, "Sony Laptop", 28000f));
        InfosList.add(new Info(5, "Apple Laptop", 90000f));
        List<Float> InfoPriceList = new ArrayList<Float>();
        for (Info Info : InfosList) {

            // filtering data of list
            if (Info.price < 30000) {
                InfoPriceList.add(Info.price);    // adding price to a InfoPriceList
            }
        }
        System.out.println(InfoPriceList);   // displaying data
    }

    public void hello1() {
        List<UserInfo> userInfos = new ArrayList<>();

        userInfos.add(new UserInfo(1, "pratik", ""));
        userInfos.add(new UserInfo(2, "ram", "kale"));
        userInfos.add(new UserInfo(3, "pawade", ""));

        List<String> stringList = new ArrayList<>();
        for (UserInfo i : userInfos) {
            if (i.name.contains("p")) {
                stringList.add(i.name);
            }
        }
        List<String> stringList1 = userInfos.stream().filter(userInfo -> userInfo.name.contains("p"))
                .map(userInfo -> userInfo.name).collect(Collectors.toList());

       List<Integer> integerList = userInfos.stream().filter(userInfo ->userInfo.id>1).map(userInfo -> userInfo.id).collect(Collectors.toList());

       userInfos.stream().filter(userInfo -> userInfo.id>1)
                       .forEach(userInfo -> System.out.println(userInfo.name));



      List<String> strings=userInfos.stream().filter(u->u.name.contains("a")).map(u->u.name).collect(Collectors.toList());


      List<Integer> integerList1= Arrays.asList(12,14,18,20,22,463,552,1,0);


/*
      System.out.println(integerList1.stream().filter(u->u%2==0).collect(Collectors.toList()));

      System.out.println(integerList1.stream().filter(s->s>=100).collect(Collectors.toList()));*/

//      integerList1.stream().sorted().forEach(System.out::println);

      int [] ints= {10,45,82,99,825};

        Arrays.stream(ints).sorted().forEach(System.out::println);

        System.out.println(strings);


        HashSet<String> hh=new HashSet<>();
        hh.add("heelo");

    }

    ArrayList<Integer> integers= new ArrayList<>();







}
