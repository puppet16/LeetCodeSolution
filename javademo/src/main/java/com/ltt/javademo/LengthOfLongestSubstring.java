package com.ltt.javademo;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abbacd";
        System.out.println("result:" + lengthOfLongestSubstring1(s));
    }

    private static int lengthOfLongestSubstring1(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int start = 0;
            int index = s.indexOf(s.substring(i, i + 1), s.indexOf(s.substring(i, i + 1)) + 1);
            if (index == -1) {
                start = s.length() - i;
            } else {
                start = index - i;
            }
            if (start > result) {
                result = start;
            }
        }

                ;

        return result;
    }
}
