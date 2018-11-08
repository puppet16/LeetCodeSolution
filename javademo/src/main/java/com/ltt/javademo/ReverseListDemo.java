package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/6.
 */
public class ReverseListDemo {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    private static ListNode reverseList(ListNode listNode) {
        ListNode temp;
        if(listNode.next != null) {
            temp = reverseList(listNode.next);
        } else {
            return new ListNode(listNode.val);
        }
        temp.next = listNode;
        listNode.next = null;
        return temp;
    }
}
