package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/2.
 */
public class AddBinaryDemo {
    public static void main(String args[]) {
        String a = "11";
        String b = "1010111";
        System.out.println("result: " + addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aRight = a.length() - 1;
        int bRight = b.length() - 1;
        int temp = 0;
        while (aRight >=0 || bRight >= 0) {
            int aValue = aRight < 0 ? 0 : Integer.valueOf(a.substring(aRight, aRight + 1));
            int bValue = bRight < 0 ? 0 : Integer.valueOf(b.substring(bRight, bRight + 1));
            int temp1 = aValue + bValue + temp;
            if(temp1 >= 2) {
                temp = 1;
                result.append(temp1 % 2);
            } else {
                temp = 0;
                result.append(temp1);
            }
            aRight--;
            bRight--;
        }
        return temp == 0 ? result.reverse().toString() : temp + result.reverse().toString();
    }
}
