package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/1.
 */
public class LengthOfLatestWordDemo {
    public static void main(String[] args) {
        String s = " ";
         System.out.println("result: " + lengthOfLastWord(s));
    }
    private static int lengthOfLastWord(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int index = s.indexOf(" ");
        if(index == -1) {
            return s.length();
        } else {
            String[] ss = s.split(" ");
            return ss.length == 0 ? 0 : ss[ss.length - 1].length();
        }
    }
}
