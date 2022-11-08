package com.pro.rev;

@FunctionalInterface
public interface someMsg extends someMsg2 {
    void say(String msg);



    int hashCode();
    String toString();
    boolean equals(Object obj);


}
