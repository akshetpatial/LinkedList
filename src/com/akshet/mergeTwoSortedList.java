package com.akshet;

import java.util.Scanner;

class ListNode {
      int val;
      ListNode next;
      ListNode head;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void addEnd(int value){
        ListNode node = new ListNode(value);
        if(head==null)
            head=node;
        else{
            ListNode temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display(){
        ListNode temp = head;
        if(temp==null)
            System.out.println("null ");
        else {
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("END\n");
        }
    }
}

//https://leetcode.com/problems/merge-two-sorted-lists/
public class mergeTwoSortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){

        ListNode newListHead = new ListNode();
        ListNode tailNewList = newListHead;
        while(list1!=null && list2!=null){
            if(list1.val<= list2.val){
                tailNewList.next=list1;
                list1=list1.next;
            }else{
                tailNewList.next=list2;
                list2=list2.next;
            }
            tailNewList=tailNewList.next;
        }
        if(list1!=null){
            while(list1!=null){
                tailNewList.next=list1;
                list1=list1.next;
                tailNewList=tailNewList.next;
            }
        }
        if(list2!=null){
            while(list2!=null) {
                tailNewList.next = list2;
                list2 = list2.next;
                tailNewList = tailNewList.next;
            }
        }

        return newListHead.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of the First List: ");
        int size_1 = scan.nextInt();
        System.out.println("Enter the Elements of the List: ");
        for(int i=0;i<size_1;i++)
            list1.addEnd(scan.nextInt());

        System.out.println("First List is: ");
        list1.display();

        ListNode list2 = new ListNode();
        System.out.println("Enter the Length of the Second List: ");
        int size_2 = scan.nextInt();
        System.out.println("Enter the Elements of the List: ");
        for(int i=0;i<size_2;i++)
            list2.addEnd(scan.nextInt());

        System.out.println("Second List is: ");
        list2.display();

        ListNode listNode =   mergeTwoLists(list1.head,list2.head);
        System.out.println("Merge List : ");
        while (listNode!=null){
            System.out.print(listNode.val+"->");
            listNode=listNode.next;
        }
        System.out.println("End");
    }
}
