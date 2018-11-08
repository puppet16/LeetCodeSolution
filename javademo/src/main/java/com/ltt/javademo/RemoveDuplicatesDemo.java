package com.ltt.javademo;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:有序数组去重
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/10/31.
 */
public class RemoveDuplicatesDemo {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1,1,1,2,2,2,2,3,3,3,4,4,4,4,5,5,5,5,6};
//        int len = removeDuplicates(nums);
//        // 在函数里修改输入数组对于调用者是可见的。
//        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
//        for (int i = 0; i < len; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("result: "+len);
        int len2 = removeDuplicates2(nums);
        for (int i = 0; i < len2; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("result: "+len2);
    }

    private static int removeDuplicates(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length - 1) {
                if(list.size() == 0) {
                    list.add(nums[i]);
                } else if(nums[nums.length - 1] > list.get(list.size() - 1)) {
                    list.add(nums[i]);
                }
            } else {
                if(nums[i] != nums[i+1]) {
                    list.add(nums[i]);
                }
            }
        }
        for(int j = 0; j < list.size(); j++) {
            nums[j] = list.get(j);
        }
        return list.size();
    }

    private static int removeDuplicates2(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }
        int i = 0, j = 1;
        int start = 0, end = 0;

        while (j < nums.length) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

            j++;
        }
        return i + 1;
    }
}
