package com.pro.rev;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public void loop(){

        /*List<Integer> arrayList =new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(14);
*//*
        for (int a:arrayList) {
            System.out.println(a);
        }*//*

        arrayList.forEach((n)->{
            System.out.println(n);
        });


        arrayList.forEach((n)->{System.out.println(n);});*/
       int width=10;
       int length=20;

       Draw draw=(a,b)->{
           System.out.println("the width is "+(a+b));

       };

       draw.draw(width,length);

       Draw draw1 =(a,b)->{
           System.out.println("this is info about my "+a+b);
       };
       draw1.draw(width,length);

      Draw draw2=(a,b)->{
          System.out.println("hello"+a+b);
      };
      draw2.draw(width,length);


       Say say=(m)->{
           String str1="hello wolrd ";
           String str2= str1+m;
           return str2;
       };

       System.out.println(say.say("i am pratik"));


    }


}
