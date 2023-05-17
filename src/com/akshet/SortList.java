package com.akshet;


import java.util.Scanner;

public class SortList {

    private static ListNode sortedList(ListNode head) {
        ListNode temp = head;
        ListNode first = head;
        ListNode second = head;
        swap(first.val, second.val);

        return temp;
    }

    private static void swap(int from, int to) {
        int temp = from;
        from = to;
        to=temp;
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
