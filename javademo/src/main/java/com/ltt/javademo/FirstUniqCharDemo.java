package com.ltt.javademo;

import java.util.HashMap;

/**
 * Desc: 387
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/8.
 */
public class FirstUniqCharDemo {

    public static void main(String[] args) {
        String s = "aabbcdde";
        System.out.println("result: " + firstUniqChar(s));
        System.out.println("result: " + firstUniqChar1(s));
    }

    private static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(0, i) + s.substring(i + 1);
            if (!temp.contains(s.substring(i, i + 1))) {
                return i;
            }
        }
        return -1;
    }

    private static int firstUniqChar1(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char aC : c) {
            if (hm.containsKey(aC)) {
                hm.put(aC, 2);
            } else {
                hm.put(aC, 1);
            }
        }
        int min = s.length();
        for (int i = 97; i <= 122; i++) {
            if (hm.get((char)i) != null) {
                System.out.println("value: " + (char) i + "    " + hm.get((char)i));
            }
            if (hm.get((char)i) != null && hm.get((char)i) == 1 && s.indexOf(i) < min) {
                min = s.indexOf(i);
            }
        }
        return min == s.length() ? -1 : min;
    }
}
