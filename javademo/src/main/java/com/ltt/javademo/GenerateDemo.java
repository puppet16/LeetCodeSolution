package com.ltt.javademo;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: 杨辉三角
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/6.
 */
public class GenerateDemo {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = generate(n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("result: " + list.get(i).toString());
        }
        System.out.println("single: " + generateSingle(n).toString());
    }

    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < j + 1; i++) {
                if (i == 0 || i == j) {
                    temp.add(1);
                } else {
                    List<Integer> temp2 = result.get(j - 1);
                    temp.add(temp2.get(i - 1) + temp2.get(i));
                }
            }
            result.add(temp);
        }
        return result;
    }

    private static List<Integer> generateSingle(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        int n = rowIndex + 1;
        for (int j = 0; j < n; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < j + 1; i++) {
                if (i == 0 || i == j) {
                    temp.add(1);
                } else {
                    List<Integer> temp2 = result.get(j - 1);
                    temp.add(temp2.get(i - 1) + temp2.get(i));
                }
            }
            result.add(temp);
        }
        return result.get(rowIndex);
    }
}
