package com.akshet;

import java.util.ArrayList;
import java.util.Scanner;

public class palindromeLL {

    public static boolean isPalindrome(ListNode head) {
        // First Approach will be using a arrayList
        /*ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        ListNode start = head;

        int i = list.size()-1;

        while(i>=0){
            if(start.val!=list.get(i))
                return false;
            i--;
            start= start.next;
        }
        return true;*/

        // Second Approach using fast and slow pointer
        if(head.next==null)
            return true;

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        // to handle the previous element
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow);
        // This line is important to maintain the continuity
        prev.next=rev;

        ListNode temp1= rev;

        while(temp!=temp1){
            if(temp.val!=rev.val)
                return false;
            rev= rev.next;
            temp=temp.next;
        }
    return true;
       /* // My Approach: Pretty bad approach

        ListNode temp = head;
        ListNode rev = reverse(head);

        // Here the head is getting updated as the reference variables and head points to same object if object changes the head
        // will change
        // Hence one way to use this to store the values in some array instead of reversing the whole array
        ListNode temp1 = rev;
        while(temp1!=null){
            System.out.print(temp1.val+"->");
            temp1=temp1.next;
        }
        System.out.println("End");

        while(temp!=null && rev!=null){
            System.out.print("value: "+temp.val+" and "+rev.val+"\n");
            if(temp.val!=rev.val){
                return false;
            }
            temp= temp.next;
            rev =  rev.next;
        }
        return true;*/
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while(current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current = next;
        }
        return prev;
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

        System.out.println("Reversed list: ");

        boolean reverseList = isPalindrome(list1.head);
        System.out.println(reverseList);

    }
}
