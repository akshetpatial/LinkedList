package com.akshet;

import java.util.ArrayList;
import java.util.Scanner;

//https://leetcode.com/problems/reverse-nodes-in-k-group/
public class reverseNodesInKGroup {

    public static ListNode reverseKNode(ListNode head, int k){

//        ListNode temp = head;
//
//        while(temp!=null)

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        ListNode temp1 = head;

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        // New Approach


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
        return null;
    }

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
