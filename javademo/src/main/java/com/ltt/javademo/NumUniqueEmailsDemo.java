package com.ltt.javademo;

import java.util.HashSet;

public class NumUniqueEmailsDemo {
    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println("IsOK:" + numUniqueEmails(emails));
    }

    private static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<String>();
        for (String s : emails) {
            System.out.println("email:" + s + "@location:" + s.indexOf("@"));
            String local1 = s.substring(0, s.indexOf("@"));
            System.out.println("Local1:" + local1);
            String local2 = local1.replace(".", "");
            System.out.println("Local2:" + local2 + "+location:" + local2.indexOf("+"));
            String local = local2.substring(0, local2.indexOf("+"));
            System.out.println("Local:" + local);
            set.add(local + s.substring(s.indexOf("@")));
        }
        return set.size();
    }
}
