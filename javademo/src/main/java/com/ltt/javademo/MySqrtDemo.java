package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/2.
 */
public class MySqrtDemo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("result: " + mySqrt(n));
    }

    private static int mySqrt(int x) {
        double mid = x / 2D;
        double l = 0.0, r = 1.0;
        while (Math.abs((mid * mid - (double) x)) > 0.000001) {
            if ((mid * mid - (double) x) > 0.000001) {
                r = mid;
                mid = l + (r - l) / 2;
            } else {
                l = mid;
                mid = l + (r - l) / 2;
            }
        }
        return (int) mid;
    }
}
