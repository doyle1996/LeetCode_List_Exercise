package com.leetcode.list;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

//    @Override
//    public String toString() {
//        return String.valueOf(val+","+ next.val+","+next.next.val+","+next.next.next.val+","+ next.next.next.next.val+","
//        + next.next.next.next.next.val);
//    }


    @Override
    public String toString() {
        if(next==null)
            return val+"";
        return val+","+next;



    }
}
