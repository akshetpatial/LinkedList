package com.akshet;

import java.util.Scanner;

public class reorderList {

    public static ListNode reorderLists(ListNode head){

        ListNode newList = newListReverse(head,true);
        ListNode unChangedList = newListReverse(head,false);

        newList.display();
        unChangedList.display();

        return newList;
    }

    private static ListNode newListReverse(ListNode head, boolean check) {
        if(check) {
            ListNode newList = new ListNode();
            ListNode temp = newList;
            ListNode prev = null;
            ListNode next;
            ListNode current = head;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                // making a newList that will contain nodes in reverse
                newList.next = prev;
                newList= newList.next;
            }
          return temp.next;
        }else{
            ListNode prev = null;
            ListNode next;
            ListNode current = head;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
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

        System.out.println("reorder List: ");

        ListNode sortedList = reorderLists(list1.head);

        sortedList.head=sortedList;
        sortedList.display();
    }
}
