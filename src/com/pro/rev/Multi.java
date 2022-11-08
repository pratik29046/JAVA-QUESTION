package com.pro.rev;

public class Multi extends Thread  implements Temp{
    public void run(){
        for (int i=0;i<=5;i++){
            try{
                sleep(600);
            }catch (Exception|Error e){
                e.printStackTrace();
            }

            System.out.println(i);
        }

    }
    public void run1(){
        for (int i=6;i<=10;i++){
            try{
                sleep(500);
            }catch (Exception|Error e){
                e.printStackTrace();
            }

            System.out.println(i);
        }

    }


    @Override
    public void hello1() {

    }
}
