package com.ltt.javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Desc:报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/10/31.
 */
public class CountAndSayDemo {

    public static void main(String[] args) {
        int n = 8;
        System.out.println("result: " + countAndSay(n));
    }

    private static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String m = countAndSay(n - 1);
        String result = "";
        char[] c = m.toCharArray();
        System.out.println("n:" + n + "  m:" + m + "  c:" + Arrays.toString(c));
        List<String> list = new ArrayList<>();
        String ss = "";
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
        for(String sss : list) {
            result = result + sss.length() + sss.substring(0,1);
        }
        return result;
    }
}
