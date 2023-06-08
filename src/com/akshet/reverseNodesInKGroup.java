package com.akshet;

import java.util.ArrayList;
import java.util.Scanner;

//https://leetcode.com/problems/reverse-nodes-in-k-group/
public class reverseNodesInKGroup {

    public static int size(ListNode head){
        if(head==null){
            return 0;
        }
        if(head.next == null){
            return 1;
        }
        int p =0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            p++;
        }
        return p;
    }

    public static ListNode reverseKNode(ListNode head, int k){

//        ListNode temp = head;
//
//        while(temp!=null)
            if(head == null){
                return null;
            }
            if(head.next ==null){
                return head;
            }

            ListNode pre = null;
            ListNode curr = head;
            ListNode Next= null;
            int count = 0;
            while( curr!= null && count<k){
                Next = curr.next;
                curr.next = pre;
                pre=  curr;
                curr = Next;
                count++;
            }
            if(Next!=null && size(Next)>=k){
                head.next = reverseKNode(Next,k);
            }
            else{
                head.next = Next;
            }
            return pre;
        }

        // Previous Approach

        // Pretty Bad Approach
        /*ListNode newList = new ListNode();
        ListNode tail = newList;

        int i = 0;
        int num = k;
        int check = list.size()-1;
        while(i<list.size()) {
            if(check >= list.size()-k) {
                if (k % 2 == 0) {
                    while (num >= i) {
                        if (num <= list.size()) {
                            tail.next = new ListNode(list.get(num - 1));
                            tail = tail.next;
                        }
                        num--;
                        i++;
                    }
                } else {
                    while (num >= i - 1) {
                        if (num <= list.size()) {
                            tail.next = new ListNode(list.get(num - 1));
                            tail = tail.next;
                        }
                        num--;
                        i++;
                    }
                }
                num = k + i;
                temp1 = temp1.next;
                check--;
            }else{
                tail.next=temp1;
            }
        }

        return newList.next;


         */
//        ListNode start =head;
//        ListNode end = head;
//        while(k!=1){
//            end = end.next;
//            k--;
//        }
       // ListNode rev = reverse(start,end);


    private static ListNode reverse(ListNode start, ListNode end) {
        ListNode current = start;
        ListNode next;
        ListNode prev = null;

        while(current!=end){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next =  prev;
        return current;
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
