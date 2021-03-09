package org.snow.auspicious.leecode.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 * 你能给出空间复杂度的解法么？ 研究
 */
public class LinkedIsReycle {
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

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> list = new HashSet<ListNode>();
        if(head==null){
            return false;
        }
        while  (head != null){
            if(!list.add(head)){
                return true;
            }
            head = head.next;

        }
        return false;
    }
}
