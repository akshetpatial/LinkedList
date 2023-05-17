package com.akshet;


import java.util.Scanner;

public class SortList {

    private static ListNode sortedList(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp3=null;

        do {
            while (first.next != temp3) {
                if (first.val > first.next.val)
                    swap(first, first.next);
                first = first.next;
            }
         temp3=first;
         first= head;
        }while(second.next!=temp3);

        return head;
    }

    private static void swap(ListNode from, ListNode to) {
        int temp = from.val;
        from.val=to.val;
        to.val=temp;
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

        System.out.println("Sorted list: ");

        ListNode sortedList = sortedList(list1.head);

        // This is used to set the head of the sortedList
        sortedList.head=sortedList;
        sortedList.display();
    }

}
