package com.ltt.javademo;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/1.
 */
public class PlusOneDemo {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        for (int i : plusOne(nums)) {
            System.out.println("result: " + i);
        }
    }

    private static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] result;
        if(digits.length ==0){
            return new int[]{1};
        }
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            int i = 0;
            for (i = digits.length - 1; i >= 0; i--) {
                if (digits[i] + 1 < 10) {
                    list.add(digits[i] + 1);
                    break;
                } else {
                    list.add(0);
                }
            }
            if (i < 0) {
                list.add(1);
            }
            while (i >= 0) {
                i--;
                if (i < 0) {
                    break;
                }
                list.add(digits[i]);
            }
            result = new int[list.size()];
            for (int j = list.size() - 1; j >= 0; j--) {
                result[list.size() - 1 - j] = list.get(j);
            }
        }
        return result;
    }
}
