package com.ltt.javademo;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/10/30.
 */
public class RomanToIntDemo {

    public static void main(String[] args) {
        String s = "V";
        System.out.println("result:" + romanToInt(s) + "  two:" + romanToInt2(s));
    }

    private static int romanToInt(String s) {
        int result = 0;
        String sign1 = "IV", sign2 = "IX", sign3 = "XL", sign4 = "XC", sign5 = "CD", sign6 = "CM";
        while (s.contains(sign1)) {
            result += 4;
            s = s.replaceFirst(sign1, "");
        }
        while (s.contains(sign2)) {
            result += 9;
            s = s.replaceFirst(sign2, "");
        }
        while (s.contains(sign3)) {
            result += 40;
            s = s.replaceFirst(sign3, "");
        }
        while (s.contains(sign4)) {
            result += 90;
            s = s.replaceFirst(sign4, "");
        }
        while (s.contains(sign5)) {
            result += 400;
            s = s.replaceFirst(sign5, "");
        }
        while (s.contains(sign6)) {
            result += 900;
            s = s.replaceFirst(sign6, "");
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.substring(i, i + 1)) {
                case "I":
                    result++;
                    break;
                case "V":
                    result += 5;
                    break;
                case "X":
                    result += 10;
                    break;
                case "L":
                    result += 50;
                    break;
                case "C":
                    result += 100;
                    break;
                case "D":
                    result += 500;
                    break;
                case "M":
                    result += 1000;
                    break;
            }
        }
        return result;
    }

    private static int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0, i = 0;
        char[] temp = s.toCharArray();
        while (i < temp.length) {
            if (i + 1 < temp.length) {
                if (map.get(temp[i]) < map.get(temp[i + 1])) {
                    result += map.get(temp[i + 1]) - map.get(temp[i]);
                    i += 2;
                    continue;
                }
            }
            result += map.get(temp[i]);
            i++;
        }
        return result;
    }
}
