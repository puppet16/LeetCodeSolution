package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/1.
 */
public class SearchInsertDemo {

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 5, 8, 10, 13};
        int target = 0;
        System.out.println("result: " + searchInsert(num, target));
    }

    private static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
