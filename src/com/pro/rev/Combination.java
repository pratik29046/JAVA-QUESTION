package com.pro.rev;

public class Combination {


    public String swaps1(String str, int i, int j) {

        char temp;
        char[] chars = str.toCharArray();
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        return String.valueOf(chars);
    }

    public void pres1(String str, int s, int j) {
        if (s == j) {
            System.out.println(str);
        } else {
            for (int k = 0; k < j; k++) {
                str = swaps1(str, s, k);
                pres1(str, s + 1, j);
                str = swaps1(str, s, k);

            }
        }


    }


}
