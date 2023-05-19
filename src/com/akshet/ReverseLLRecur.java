package com.akshet;

import java.util.Scanner;

public class ReverseLLRecur {

    private static ListNode reverseList(ListNode head) {
        
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

        ListNode reverseList = reverseList(list1.head);

        // This is used to set the head of the sortedList
        // using Bubble Sort
        reverseList.head=reverseList;
        reverseList.display();
    }

}
