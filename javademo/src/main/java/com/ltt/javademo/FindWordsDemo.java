package com.ltt.javademo;

import java.util.Arrays;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/2.
 */
public class FindWordsDemo {
    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println("" + Arrays.toString(findWords(words)));
    }

    private static String[] findWords(String[] words) {
        String one = "QWERTYUIOP";
        String two = "ASDFGHJKL";
        String three = "ZXCVBNM";
        int index = 0;
        String[] result = new String[words.length];
        for (String s : words) {
            char[] charList = s.toCharArray();
            boolean haveOne = false, haveTwo = false, haveThree = false;
            int i = 0;
            for (i = 0; i < charList.length; i++) {
                char c = charList[i];
                if (one.contains(String.valueOf(c).toUpperCase())) {
                    haveOne = true;
                    if (haveTwo || haveThree) {
                        break;
                    }
                }
                if (two.contains(String.valueOf(c).toUpperCase())) {
                    haveTwo = true;
                    if (haveOne || haveThree) {
                        break;
                    }
                }
                if (three.contains(String.valueOf(c).toUpperCase())) {
                    haveThree = true;
                    if (haveOne || haveTwo) {
                        break;
                    }
                }
            }
            if (i == charList.length) {
                result[index] = s;
                index++;
            }
        }
        return result;
    }
}
