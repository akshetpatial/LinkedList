package com.akshet;

import java.util.Scanner;

//https://leetcode.com/problems/reverse-nodes-in-k-group/
public class reverseNodesInKGroup {

    public static ListNode reverseKNode(ListNode head, int k){

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of the List: ");
        int size_1 = scan.nextInt();
        System.out.println("Enter the Elements of the List: ");
        for(int i=0;i<size_1;i++)
            list1.addEnd(scan.nextInt());

        System.out.println("List is: ");
        list1.display();

        System.out.println("Enter K (number of nodes to reverse): ");
        int k = scan.nextInt();
        System.out.println("Reversed list: ");

       ListNode reverseList = reverseKNode(list1.head,k);
        reverseList.head=reverseList;
        reverseList.display();
    }
}
