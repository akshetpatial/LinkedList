package com.akshet;


import java.util.Scanner;

public class SortList {

    // This is Bubble Sort hence it may exceed time limit
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


    private static ListNode sortedListMerge(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode mid = midNode(head);

        ListNode left = sortedListMerge(head);
        ListNode right= sortedListMerge(mid);

        return Merge(left, right);
    }

    private static ListNode midNode(ListNode head) {
        // This will only find mid but we also want to break the list
       /* ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;*/
    }

    private static ListNode Merge(ListNode list1, ListNode list2) {

        ListNode newList = new ListNode();
        ListNode tail= newList;

//        while(node1.next!=null && node2.next!=null){
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;
            }else{
                tail.next=list2;
                list2=list2.next;
            }
            tail= tail.next;
        }

        if(list2!=null){
            while(list2!=null){
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        if(list1!=null){
            while(list1!=null){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
        }
    return newList.next;
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
        // using Bubble Sort
        sortedList.head=sortedList;
        sortedList.display();

        // Using Merge Sort
        ListNode list2 = new ListNode();
        System.out.println("Enter the Length of the List: ");
        int size_2 = scan.nextInt();
        System.out.println("Enter the Elements of the List: ");
        for(int i=0;i<size_2;i++)
            list2.addEnd(scan.nextInt());

        System.out.println("List is: ");
        list2.display();

        System.out.println("Sorted list: ");
        ListNode sortedListMerge = sortedListMerge(list2.head);
        sortedListMerge.head=sortedListMerge;
        sortedListMerge.display();
    }

}
