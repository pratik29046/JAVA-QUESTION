package com.pro.rev;

import java.io.*;
import java.util.*;

public class Reverse {
    public String hello(String a) {
        char ch;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            s.insert(0, ch);
        }
        return s.toString().trim();
    }

    public String rev(String a) {

        char c;
        String s = "";

        for (int i = 0; i < a.length(); i++) {

            c = a.charAt(i);
            s = c + s;
        }
        return s;
    }


    public String reve(String s) {
        char s1;
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            s1 = s.charAt(i);
            s2 = s2 + s1;
        }
        return s2;

    }


    public String revStatement(String s) {
        int x = s.indexOf(" ");
        if (x == -1) {
            return s;
        }

        return revStatement(s.substring(x + 1)) + " " + s.substring(0, x);
    }


    public String revs(String s) {
        char ch;
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            a = ch + a;

        }


        return a;
    }

    public String revw(String s) {
        int x = s.indexOf(" ");

        if (x == -1) {
            return s;
        }
        return revw(s.substring(x + 1)) + " " + s.substring(0, x);

    }


    public void leftPattern(int a) {
        int i, j;

        for (i = 0; i < a; i++) {

            for (j = (a - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public void pat(int row) {
        int i, j;

        for (i = 0; i < row; i++) {
            for (j = row - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void dMon(int a) {
        int i, j, space;

        int s = 1;
        space = a - 1;
        for (i = 0; i < a; i++) {

            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;

            for (j = 0; j <= 2 * i; j++) {

                System.out.print(s);
                s++;

            }

            System.out.println("");
        }


//        space=1;
//        for(i=0;i< a;i++){
//
//            for(j=0;j<=space;j++){
//                System.out.print(" ");
//            }
//            space++;
//
//            for (j=0;j<=2*(a-i);j++){
//                System.out.print("*");
//            }
//
//            System.out.println("");
//        }


    }

    public void acs(int a) {

        for (int m = 1; m <= a; m++) {
            for (int n = a; n > m; n--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int m = a - 1; m >= 1; m--) {
            for (int n = a - 1; n >= m; n--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) - 1; p++) {
                System.out.print("*");
            }
            System.out.println("");


        }


    }


    public void hhdd() {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int k = i; k <= n; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void hh() {
        int a = 10;
        for (int m = 1; m <= a; m++) {
            for (int n = a; n > m; n--) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (m * 2) - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
