package org.snow.auspicious.leecode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表环的入口节点\题目描述
 * 对于一个给定的链表，返回环的入口节点，如果没有环，返回null
 * 拓展：
 * 你能给出不利用额外空间的解法么？ 还需要探讨
 */
public class LinkedReycle {
    public static void main(String[] args) {

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

    public ListNode detectCycle(ListNode head) {
        //1.如果head 为null 直接返回
        if ( head == null ){
            return head;
        }
        //2.
        List<ListNode> list = new ArrayList<>();
        while  (head != null){
            if(list.contains(head)){
                return head;
            }
            list.add(head);
            head = head.next;

        }
        return null;



    }
}
