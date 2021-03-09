package org.snow.auspicious.leecode.solution;

import java.util.HashMap;
import java.util.Map;

public class TowNumAddLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3,new ListNode(4,new ListNode(8)));
        ListNode l2 = new ListNode(3,new ListNode(6,new ListNode(8)));
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode curr = listNode;
        int s = 0;
        while (l1 != null || l2 != null || s !=0) {
            int a = l1 != null ? l1.val:0;
            int b = l2 != null ? l2.val:0;

            int sumVal = a+b+s;
            int c = sumVal / 10;
            s = c;
            ListNode node = new ListNode(sumVal % 10);
            curr.next = node;
            curr = node;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;


        }
        return listNode.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        Map map = new HashMap<String,String>();
        map.put("a","a");
        ListNode curr = listNode;
        int s = 0;
        while (l1 != null || l2 != null) {
            int a = 0;
            int b =0;
            if(l1 != null) {
                a = l1.val;
                l1 = l1.next;

            }
            if(l2 != null) {
                b = l2.val;
                l2 = l2.next;

            }

            int sumVal = a+b+s;
            int c = sumVal / 10;
            s = c;
            ListNode node = new ListNode(sumVal % 10);
            curr.next = node;
            curr = node;



        }
        if (s>0){
            curr.next = new ListNode(s);
        }
        return listNode.next;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
