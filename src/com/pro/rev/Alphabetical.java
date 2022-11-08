package com.pro.rev;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Alphabetical {

    public void alpha(){

        String [] temp = {"hello","are","you","there" ,"are"};

        for(int i=0;i<temp.length;i++){

            for(int j=i+1;j<temp.length;j++){

                if(temp[i].compareTo(temp[j])>0){

                    String temps=temp[i];
                    temp[i]=temp[j];
                    temp[j]=temps;

                }
            }
        }
        System.out.println(Arrays.toString(temp));

    }


    public  void alpha1(){
        try{
            String [] temp = {"hello","are","you","there" ,"are"};

            for(int i=0;i<temp.length;i++){
                for(int j=i+1;j<temp.length;j++){

                    if(temp[i].compareTo(temp[j])>0) {
                        String s;
                        s = temp[i];
                        temp[i] = temp[j];
                        temp[j] = s;
                    }
                }
            }

            for(String a:temp){
                System.out.println(a);
            }

        }catch (Exception| Error e){
            e.printStackTrace();
        }


    }

    public void Asc(){
        int [] arr={5,1,8,9,2,10};
        for(int i=0; i< arr.length; i++){
            int index=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    public void Ascs() {

        Scanner scanner = new Scanner(System.in);


        int[] arr = {555, 5, 1, 8, 9, 2, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
/*
    hibernate.dialect=org.hibernate.dialect.Sql;
    hibernate.connection.url= jdbc:oracle:thin:@localhost:1521:xe
    hibernate.connection.username:
    hibernate.connection.password:
    hibernate.connnection.driver.class:oracal.jdbc.driver.OracalDriver
    hibernate.show_sql:true
    hibernate.hbm2ddl=update;*/




}
