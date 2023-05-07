package com.akshet;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DoublyLinkedList {

    public static void main(String[] args) {
        // In Java LinkedList can also be used a doubly Linked List
        List<Integer> doubleLL= new LinkedList<>();

        DoublyLL doubleLLCus = new DoublyLL();

        System.out.println("options!");
        System.out.println("Press 1 to Add at the End");
        System.out.println("Press 2 to Add at the Beginning");
        System.out.println("Press 3 to Add at a given index");
        System.out.println("Press 4 to Delete at the End");
        System.out.println("Press 5 to Delete at the Beginning");
        System.out.println("Press 6 to Delete at a given index");
        System.out.println("Press 0 to Exit");
        System.out.println("Enter your choice");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        boolean check = true;

        while(check) {
               /* if(doubleLLCus.size()==0)
                    check=false;
                else{*/
                switch (choice) {
                    case 0:
                        System.out.println("Bye");
                        check=false;
                        break;
                    case 1:
                        System.out.println("How many times you want to Add Element at the End");
                        int count = scan.nextInt();
                        System.out.println("Enter the value/values you want to Add");
                        for (int i =0; i<count;i++) {
                            int val = scan.nextInt();
                            doubleLLCus.addEnd(val);
                        }
                        doubleLLCus.display();
                        System.out.println("size: "+doubleLLCus.size());
                        break;
                    case 2:
                        System.out.println("How many times you want to Add Element at the Beginning");
                        int count_1 = scan.nextInt();
                        System.out.println("Enter the value/values you want to Add");
                        for (int i =0; i<count_1;i++) {
                            int val = scan.nextInt();
                            doubleLLCus.addBegin(val);
                        }
                        doubleLLCus.display();
                        System.out.println("size: "+doubleLLCus.size());
                        break;
                    case 3:
                    System.out.println("Add at the given index");
                    System.out.println("Enter the index where you want to Add");
                    int index = scan.nextInt();
                    System.out.println("Enter the Value");
                    int val = scan.nextInt();
                        doubleLLCus.AddAtIndex(index,val);
                        doubleLLCus.display();
                        System.out.println("size: "+doubleLLCus.size());
                        break;
                    case 4:
                        System.out.println("Delete at the End");
                            doubleLLCus.deleteEnd();
                        doubleLLCus.display();
                        System.out.println("size: "+doubleLLCus.size());
                        break;
                    case 5:
                        System.out.println("Delete at the Beginning");
                        doubleLLCus.deleteBegin();
                        doubleLLCus.display();
                        System.out.println("size: "+doubleLLCus.size());
                        break;
                    case 6:
                        System.out.println("Delete at a given index");
                        System.out.println("Enter the index where you want to Delete");
                        int index_1 = scan.nextInt();
                        doubleLLCus.deleteAtIndex(index_1);
                        doubleLLCus.display();
                        System.out.println("size: "+doubleLLCus.size());
                        break;
                    default:
                        System.out.println("Please Enter from the Given options only");
                }
                    if(doubleLLCus.size()!=0 && check) {
                        System.out.println("Please Enter your choice again!");
                        choice = scan.nextInt();
                    }
                    if(doubleLLCus.size()==0)
                        check=false;
            //}
        }

    }
}
