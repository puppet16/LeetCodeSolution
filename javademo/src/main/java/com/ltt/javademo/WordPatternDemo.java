package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/7.
 */
public class WordPatternDemo {
    public static void main(String[] args) {
        String pattern = "";
        String str = "dog";
        System.out.println("result: " + wordPattern(pattern, str));
    }

    private static boolean wordPattern(String pattern, String str) {
        String[] patternArray = pattern.split("");
        String[] strArray = str.split(" ");
        if (pattern.length() != strArray.length) {
            return false;
        }
        String temp = "";
        int i;
        for (i = 0; i < strArray.length; i++) {
            if (temp.contains(patternArray[i])) {
                if (!strArray[temp.indexOf(patternArray[i])].equals(strArray[i])) {
                    break;
                }
            } else {
                if (i != 0 && strArray[i].equals(strArray[i - 1])) {
                    break;
                }
            }
            temp += patternArray[i];
        }
        return i == strArray.length;
    }
}
