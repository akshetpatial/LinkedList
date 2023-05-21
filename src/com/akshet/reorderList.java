package com.akshet;

import java.util.ArrayList;
import java.util.Scanner;

//https://leetcode.com/problems/reorder-list/
public class reorderList {

    public static ListNode reorderLists(ListNode head){

        /*ListNode newList = newListReverse(head,true);
        ListNode unChangedList = newListReverse(head,false);*/

        //Approach one:  Make a new ArrayList

        /*ArrayList<Integer> list = new ArrayList<>();
        ListNode temp= head;
        ListNode start = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int size = list.size()-1;
        int i = size;
        ListNode newList = new ListNode();
        ListNode tail = newList;
        int count =0;
        while(count<=size){
            if(count%2==0){
                tail.next=start;
                start=start.next;
            }else{
                tail.next= new ListNode(list.get(i));
                i--;
            }
            count++;
            tail=tail.next;
        }
        tail.next=null;
    return newList.next;*/

        // Approach Two using slow and Fast pointer
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Minor changes
        // ListNode rev = reverseMidList(slow);
        ListNode rev = reverseMidList(slow.next);
        slow.next=null;

        // Or We can also use this
        while(temp!=null && rev!=null){
            ListNode head1 = temp.next;
            ListNode head2 = rev.next;
            rev.next = head1;
            temp.next = rev;
            temp = head1;
            rev = head2;
        }
        return head;

       /* ListNode rev = reverseMidList(slow);
        ListNode newList = new ListNode();
        ListNode tail = newList;
        int count=0;
        while(temp!=slow){
            if(count%2==0) {
                tail.next = temp;
                temp = temp.next;
            }else{
                tail.next = rev;
                rev = rev.next;
            }
            count++;
            tail=tail.next;
        }
        tail.next=rev;
        return  newList.next;*/
    }

    private static ListNode reverseMidList(ListNode head) {
        ListNode prev = null;
        ListNode next;
        ListNode current = head;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /*private static ListNode newListReverse(ListNode head, boolean check) {
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
          return temp;
        }else{
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
            return temp;
        }
    }*/


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
