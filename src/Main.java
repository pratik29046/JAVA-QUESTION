import com.pro.rev.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

@FunctionalInterface
interface hello{
    int add(int a);

}

class A{

    A(){
        System.out.println("A const");
    }
    public void A1(){
        System.out.println("a1");
    }

}

class B extends A{
    B(){
        System.out.println("B const");
    }

    public void B1(){
        System.out.println("B1");

    }
    public void A1(){
        System.out.println("A1");
    }
}





public class Main {

    public static void main(String[] args) throws InterruptedException {
        Reverse reverse = new Reverse();
//        System.out.println(reverse.hello("   hello  my dear friend   "));
//        System.out.println(reverse.revs("i love my india"));
//
//        System.out.println(reverse.revStatement("i love my india"));
//
//        System.out.println(reverse.revw("    love my india"));



        /*String a=String.format("%d",11);
        String b=String.format("%d",11);
        String c=String.format("%d",11);
        String d=String.format("%d",11);


        String e=""+a+":"+b+":"+":"+c+":"+d;
        System.out.println(e);*/

//        reverse.dMon(5);

        /*Lambda lambda = new Lambda();
        lambda.loop();*/

        Multi multi = new Multi();
//        multi.start();
  /*      Thread thread = new Thread(multi);
        thread.start();
        Thread thread1 =new Thread(multi);

        System.out.println(thread.getName());
        System.out.println(thread1.getName());*/
        /*System.out.println(multi.getName());
        Multi multi1=new Multi();
        Multi multi2 = new Multi();
        multi.start();
        multi.join(8000);

        System.out.println(multi1.getName());
        multi1.start();
        multi1.join(8000);

        System.out.println(multi2.getName());
        multi2.start();
        multi2.join(16000);

        System.out.println(multi.getName().indexOf(0));*/

     /*   Combination combination = new Combination();
        String str = "AAB";
        int n = str.length();
//        combination.pre(str,0,n-1);
//
        combination.pres(str,0,n-1);*/


        try {
          /*  Combination combination = new Combination();
            String str = "A B D";
            int n = str.length();

            combination.pres1(str, 0, n - 1);*/

//            Alphabetical alphabetical= new Alphabetical();
//            alphabetical.alpha1();




//            String[] sentence = "I love India".split(" ");
//            String rev_str = "";
//            for (int i = sentence.length - 1; i >= 0; i--) {
//                rev_str += sentence[i] + " ";
//            }
//            System.out.println("Reversed string: " + rev_str);


            Reverse reverse1= new Reverse();
//            System.out.println(reverse.revStatement("i love my india"));



/*
            String [] arr="hi i am pratik".split(" ");
            String s="";
            for(int i=arr.length-1;i>=0;i--){
                s+=arr[i]+" ";
            }
            System.out.println(s);


            System.out.println(reverse1.reve("hello how are "));*/

          /*  A a= new B();
            a.A1();*/

            /*Unique unique= new Unique();
            unique.uni();*/

            /*Reverse reverse2= new Reverse();
            reverse2.acs(5);*/

          /*  Alphabetical alphabetical=new Alphabetical();
            alphabetical.Ascs();*/

            /*Lambda lambda = new Lambda();
            lambda.loop();*/

            /*new Thread(()->{
                System.out.println("new thread is create");
            }).start();
            new Thread(()->{
                System.out.println("thread 2 is create");
            }).run();*/

          /*  int a = 5;

            // lambda expression to define the calculate method
            hello s = (int x) -> x * x;

            // parameter passed and return type must be
            // same as defined in the prototype
            int ans = s.add(a);
            System.out.println(ans);
*/

          /*  FunctionInterface functionInterface = new FunctionInterface();
            functionInterface.say("I am pratik Pawade");
            functionInterface.hello();*/



           /* BiConsumer<String,String> stringStringBiConsumer= BiConsumerInterfaceExample::hello;
            stringStringBiConsumer.accept("pratik","25");
            stringStringBiConsumer.accept("raju","55");*/

            /*Map<Integer,String> map=new HashMap<>();
            map.put(10,"rahul");
            map.put(11,"karan");

            System.out.println("map values "+map.get(10));

            BiConsumer<Map<Integer, String>,String> biCon = BiConsumerInterfaceExample::hello1;
            biCon.accept(map,"hello");*/

            /*Reverse reverse2 =new Reverse();
            reverse2.hhdd();*/


            /*Streams streams = new Streams();
            streams.hello1();

            Temp2 temp2= new Temp2();
            temp2.hello();
*/
            Unique unique =new Unique();
            unique.uni2();



        } catch (Error | Exception e) {
            e.printStackTrace();
        }


    }
}