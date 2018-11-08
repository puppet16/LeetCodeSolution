package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/5.
 */
public class MergeArraysDemo {

    public static void main(String[] args) {
        int[] a = new int[8];
        int[] b = new int[]{2, 5, 7};
        merge(a, a.length, b, b.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("result: " + "i---" + i + "   value:" + a[i]);
        }
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i <nums2.length; i++) {
            nums1[nums1.length - i - 1] = nums2[i];
        }
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums1.length - i - 1; j++) {
                if(nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }

    private static int indexOf(int[] nums1, int value) {
        int result = nums1.length - 1;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > value) {
                return i;
            }
            if(nums1[i] == 0) {
                return i;
            }
        }
        return result;
    }
}
