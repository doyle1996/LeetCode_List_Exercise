package com.leetcode.list;

public class 合并两个有序链表 {
    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13= new ListNode(4);

        node11.next=node12;
        node12.next=node13;

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node23= new ListNode(4);


        node21.next=node22;
        node22.next=node23;

        ListNode res=mergeTwoLists(node11,node21);

        System.out.println(res.toString());
    }
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        else if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

}
