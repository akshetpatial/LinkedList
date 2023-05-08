package com.akshet;

import java.util.Scanner;

 class CustomLL extends ll{

     // Using Recursion
     /*public void addElement(int index, int value) {
         Node temp = getHead();
         if(index==0) {
             addBegin(value);
             return;
         }

         helperFunction(index,value,temp,1);
     }

     private void helperFunction(int index, int value, Node temp, int count) {
         Node newNode = new Node(value);
         if(temp==null)
             System.out.println("Not Possible as index is put of Bound!");
         else {
             if (count > index) {
                 return;
             }
             if (count == index) {
                 newNode.setNext(temp.getNext());
                 temp.setNext(newNode);
             }
             helperFunction(index, value, temp.getNext(), count + 1);
         }
     }*/

     // Another Way
     public void addElement(int index, int value) {
         Node temp = getHead();
         // Set the Head
         setHead(helperFunction(index,value,temp));

     }

     private Node helperFunction(int index, int value, Node temp) {
         if(index==0){
             Node newNode = new Node(value);
             newNode.setNext(temp);
             return newNode;
         }
         temp.setNext(helperFunction(index-1,value,temp.getNext()));
         return temp;
     }


 }

public class InsertUsingRecursion {
    public static void main(String[] args) {

        CustomLL linkedList = new CustomLL();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 elements of the List");
        for( int i=0;i<5;i++){
            linkedList.addEnd(scan.nextInt());
        }
        //Display
         linkedList.display();

        System.out.println("Enter the Element you want to Enter at the Given Index");
        System.out.println("Enter the Index: ");
        int index = scan.nextInt();
        System.out.println("Enter the Value: ");
        int value = scan.nextInt();

        linkedList.addElement(index,value);

        //Display
        linkedList.display();

    }
}
