package com.ltt.javademo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SingleNumber_136 {

    public static void main(String[] args) {
        int[] num = new int[]{2,2,1};
        System.out.println("result: " + singleNumber(num));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num1 : nums) {
            if (map.keySet().contains(num1)) {
                map.put(num1, 2);
            } else {
                map.put(num1, 1);
            }
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
