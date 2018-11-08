package com.ltt.javademo;

/**
 * Desc:
 * Author ltt
 * Email: litt@mixotc.com
 * Date:  2018/11/5.
 */
public class DeleteDuplicatesDemo {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    private ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode result = new ListNode(head.val);
        ListNode result1 = result;
        ListNode temp = head;

        while(temp != null  && temp.next != null) {
            if(result.val != temp.next.val) {
                result.next = temp.next;
                result = result.next;
            }
            temp = temp.next;
        }
        result.next = null;
        return result1;
    }
}
