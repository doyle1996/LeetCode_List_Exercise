package com.leetcode.list;



public class 两个非空链表相加 {
    public static void main(String[] args) {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13= new ListNode(3);

        node11.next=node12;
        node12.next=node13;

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23= new ListNode(9);


        node21.next=node22;
        node22.next=node23;
        System.out.println(addTwoNumbers(node11,node21));

    }
    public  static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int zen_number=0;
        while(l1!=null||l2!=null||zen_number!=0){
            int l1_val=l1!=null?l1.val:0;
            int l2_val=l2!=null?l2.val:0;
            int sum_val=l1_val+l2_val+zen_number;
            zen_number=sum_val/10;
            ListNode sum_node=new ListNode(sum_val%10);
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            //确定curr指针下一个移动的方向
            curr.next=sum_node;
            //移过去
            curr=sum_node;

        }
        return dummy.next;
    }
}
