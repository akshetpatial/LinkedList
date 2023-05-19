package com.akshet;

import java.util.Scanner;

public class ReverseLLRecur {
    private static ListNode reverseListRecur(ListNode head, int size) {
        if(size<2)
            return head;

        if(head.next==null)
            return head;


        ListNode prev = reverseListRecur(head.next, size);
        ListNode temp = prev;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = head;
        head.next=null;
        return prev;
    }

    public static void main(String[] args){
        ListNode list1 = new ListNode();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of the List: ");
        int size_1 = scan.nextInt();
        System.out.println("Enter the Elements of the List: ");
        for(int i=0;i<size_1;i++)
            list1.addEnd(scan.nextInt());

        System.out.println("List is: ");
        list1.display();

        System.out.println("Reversed list: ");

        ListNode reverseList = reverseListRecur(list1.head,size_1);
        reverseList.head=reverseList;
        reverseList.display();

    }

}
