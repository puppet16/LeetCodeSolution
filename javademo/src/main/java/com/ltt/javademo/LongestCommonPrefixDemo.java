package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/10/30.
 */
public class LongestCommonPrefixDemo {

    public static void main(String[] args) {
        String[] s = new String[]{"aa","aa","aab"};
        System.out.println("result:" + longestCommonPrefix(s));
    }
    private static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        char[] c = strs[0].toCharArray();
        String result = "";
        for(int i = 0 ; i < c.length ; i++) {
            for(int j = 1 ; j < strs.length ; j++) {
                if(strs[j].indexOf(c[i],i) != i) {
                    return result;
                }
            }
            result +=c[i];
        }

        return result;
    }
}
