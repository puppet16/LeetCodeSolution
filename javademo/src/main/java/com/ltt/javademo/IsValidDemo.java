package com.ltt.javademo;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/10/30.
 */
public class IsValidDemo {
    public static void main(String[] args) {
        float a = 2147483651F;
        int b = Integer.MAX_VALUE;
        System.out.println(""+ (a - b > 0)+"  :"+(a>b));
        String s = "";
        System.out.println("result:" + isValid(s));
    }

    private static boolean isValid(String s) {
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, true);
        map.put(2, true);
        map.put(3, true);
        //AscII码 ( = 40, )  = 41, [  = 91, ]  = 93, {  = 123, }  = 125
        char[] ca = s.toCharArray();
        for (char c : ca) {
            if(c == 40) {
                map.put(1, !map.get(1));
            }
            if(c == 91) {
                map.put(2, !map.get(2));
            }
            if(c == 123) {
                map.put(3, !map.get(3));
            }
            if(c == 40) {
                map.put(1, !map.get(1));
            }
            if(c == 40) {
                map.put(1, !map.get(1));
            }
            if(c == 40) {
                map.put(1, !map.get(1));
            }
        }
        return true;
    }
}
