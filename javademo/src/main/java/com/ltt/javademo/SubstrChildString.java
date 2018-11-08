package com.ltt.javademo;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/1.
 */
public class SubstrChildString {

    public static void main(String[] args) {
        String s = "11";
        List<String> list = new ArrayList<>();
        String ss = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                ss = String.valueOf(c[i]);
                continue;
            }
            if (c[i - 1] != c[i]) {
                list.add(ss);
                ss = String.valueOf(c[i]);
            } else {
                ss += String.valueOf(c[i]);
            }
        }
        if (ss.length() > 0) {
            list.add(ss);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println("content:" + j + "    " + list.get(j));
        }
    }
}
