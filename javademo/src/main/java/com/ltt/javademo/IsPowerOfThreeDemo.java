package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/8.
 */
public class IsPowerOfThreeDemo {
    public static void main(String[] args) {
        int n = 14;
        for(int i = 0; i < 10000; i++) {
            if(isPowerOfThree(i)) {
                System.out.println("result: " + i);
            }
        }
    }

    private static boolean isPowerOfThree(int n) {
        if(n == 0) {
            return false;
        }
        int m = n;
        while (m != 1) {
            if (m % 3 == 0) {
                m = m / 3;
            } else {
                return false;
            }
        }
        return true;
    }
}
