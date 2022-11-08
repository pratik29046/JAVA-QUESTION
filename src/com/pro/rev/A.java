package com.pro.rev;

class A {
    A(){
        System.out.println(" A const");
    }
    public void A1(){
        System.out.println("a1");
    }

}

class B extends A {
    B(){
        System.out.println("B const");
    }

    public void B1(){
        System.out.println("B1");

    }
    public void A1(){
        System.out.println("A1");
    }

    public void main(String [] args){
        A a = new B();
        a.A1();
    }
}
