package com.akshet;

import java.util.LinkedList;
import java.util.Scanner;

 class CustomLL<Integer> extends LinkedList<Integer>{

     public void addElement(Integer index, Integer value) {

     }
 }

public class InsertUsingRecursion {
    public static void main(String[] args) {

        CustomLL<Integer> linkedList = new CustomLL<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 elements of the List");
        for( int i=0;i<5;i++){
            linkedList.add(scan.nextInt());
        }

        //Display
        for(int ele : linkedList)
            System.out.print(ele+" -> ");
        System.out.println("End");

        System.out.println("Enter the Element you want to Enter at the Given Index");
        System.out.println("Enter the Index: ");
        int index = scan.nextInt();
        System.out.println("Enter the Value: ");
        int value = scan.nextInt();

        linkedList.addElement(index,value);

        //Display
        for(int ele : linkedList)
            System.out.print(ele+" -> ");
        System.out.println("End");

    }
}
