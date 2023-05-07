package com.akshet;

import java.util.Scanner;

public class CircularLinkedList {

    public static void main(String[] args) {
        CircularLL CircularLLCus = new CircularLL();

        System.out.println("options!");
        System.out.println("Press 1 to Add at the End");
        System.out.println("Press 2 to Add at the Beginning");
        System.out.println("Press 3 to Add at a given index");
        System.out.println("Press 4 to Delete at the End");
        System.out.println("Press 5 to Delete at the Beginning");
        System.out.println("Press 6 to Delete at a given index");
        System.out.println("Press 7 to Reverse a Linked List");
        System.out.println("Press 0 to Exit");
        System.out.println("Enter your choice");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        boolean check = true;

        while(check) {
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
                        CircularLLCus.addEnd(val);
                    }
                    CircularLLCus.display();
                    System.out.println("size: "+CircularLLCus.size());
                    break;
                case 2:
                    System.out.println("How many times you want to Add Element at the Beginning");
                    int count_1 = scan.nextInt();
                    System.out.println("Enter the value/values you want to Add");
                    for (int i =0; i<count_1;i++) {
                        int val = scan.nextInt();
                        CircularLLCus.addBegin(val);
                    }
                    CircularLLCus.display();
                    System.out.println("size: "+CircularLLCus.size());
                    break;
                case 3:
                    System.out.println("Add at the given index");
                    System.out.println("Enter the index where you want to Add");
                    int index = scan.nextInt();
                    System.out.println("Enter the Value");
                    int val = scan.nextInt();
                    CircularLLCus.AddAtIndex(index,val);
                    CircularLLCus.display();
                    System.out.println("size: "+CircularLLCus.size());
                    break;
                case 4:
                    System.out.println("Delete at the End");
                    CircularLLCus.deleteEnd();
                    CircularLLCus.display();
                    System.out.println("size: "+CircularLLCus.size());
                    break;
                case 5:
                    System.out.println("Delete at the Beginning");
                    CircularLLCus.deleteBegin();
                    CircularLLCus.display();
                    System.out.println("size: "+CircularLLCus.size());
                    break;
                case 6:
                    System.out.println("Delete at a given index");
                    System.out.println("Enter the index where you want to Delete");
                    int index_1 = scan.nextInt();
                    CircularLLCus.deleteAtIndex(index_1);
                    CircularLLCus.display();
                    System.out.println("size: "+CircularLLCus.size());
                    break;
                case 7:
                    System.out.println("Reverse a Linked List");
                    CircularLLCus.reverse();
                    CircularLLCus.display();
                    System.out.println("size: "+CircularLLCus.size());
                    break;
                default:
                    System.out.println("Please Enter from the Given options only");
            }
            if(CircularLLCus.size()!=0 && check) {
                System.out.println("Please Enter your choice again!");
                choice = scan.nextInt();
            }
            if(CircularLLCus.size()==0)
                check=false;
        }
    }

}
