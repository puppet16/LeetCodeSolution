package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/10/30.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int a = -2147483648;
        int b = 1563847412;
        System.out.println("" + (2147483651L > 2147483647));
        System.out.println("IsOK:" + reverse(b));
    }

    private static int reverse(int x) {
        String temp = String.valueOf(x);
        if(temp.contains("-")) {
            temp = temp.substring(temp.indexOf("-")+1);
        }
        String s = "";
        char[] c = temp.toCharArray();
        for (char aC : c) {
            s = aC + s;
        }
        if(x < 0) {
            s = "-" + s;
        }
        long mm = Long.parseLong(s);
        if(mm > Integer.MAX_VALUE || mm < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.parseInt(s);
    }
}
