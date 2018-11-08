package com.ltt.javademo;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/10/30.
 */
public class IsPalindrome {
    public static void main(String[] args) {
        int s = 123321;
        System.out.println("result:" + isPalindrome2(s));
    }

    private static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> list = new ArrayList<Integer>();
        int y = x;
        while (y != 0) {
            list.add(y % 10);
            y = y / 10;
        }
        int l = 0, r = list.size() - 1;
        while (l < r) {
            if (list.get(l) != list.get(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
