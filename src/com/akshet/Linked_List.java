package com.akshet;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {

    public static void main(String[] args) {
        LinkedList<Integer> inBuiltLL = new LinkedList<>() ;

        /*System.out.println("Using InBuilt Linked List");
        System.out.println("Size of the Array!");
        System.out.println(inBuiltLL.size());

        System.out.println("Add 5 Integer Element to add at the Beginning");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            inBuiltLL.addFirst(scan.nextInt());
        }
        // Displaying
        for (Integer integer : inBuiltLL) {
            System.out.print(integer + " -> ");
        }
        System.out.println("null\n");

        System.out.println("Size of the Linked List after adding 5 elements at the Beginning");
        System.out.println(inBuiltLL.size());

        System.out.println("Add 5 Integer Element at the End");
        for(int i=0;i<5;i++) {
            inBuiltLL.addLast(scan.nextInt());
        }
        // Displaying
        for (Integer integer : inBuiltLL) {
            System.out.print(integer + " -> ");
        }
        System.out.println("null\n");

        System.out.println("Size of the Linked List after adding 5 elements at the End");
        System.out.println(inBuiltLL.size());
*/

        // We can also create a custom linked list
        System.out.println("Using Custom Build Linked List");
        ll customLL = new ll();

        System.out.println("Size of the Array!");
        System.out.println(customLL.size());

        Scanner scan = new Scanner(System.in);

        System.out.println("Add 5 Integer Element to add at the Beginning");
        for(int i=0;i<5;i++) {
            customLL.addBegin(scan.nextInt());
        }
        customLL.display();

        System.out.println("Size of the Linked List after adding 5 elements at the Beginning");
        System.out.println(customLL.size());

        System.out.println("Add 5 Integer Element at the End");
        for(int i=0;i<5;i++) {
            customLL.addEnd(scan.nextInt());
        }
        customLL.display();

        System.out.println("Size of the Linked List after adding 5 elements at the End");
        System.out.println(customLL.size());

        System.out.println("Enter the index where you want to put the Element");
        customLL.addAtIndex(scan.nextInt(),scan.nextInt());

        customLL.display();

        System.out.println("Size of the Linked List after adding an element at the given Index");
        System.out.println(customLL.size());


        System.out.println("Options");
        System.out.println("Press 1 to delete at the beginning! ");
        System.out.println("Press 2 to delete at the end!");
        System.out.println("Press 3 to delete at the given index!");
        System.out.println("Press 0 to exit!");
        int choose=scan.nextInt();

        boolean check = true;
            while(check) {
                if(customLL.size()==0)
                    check = false;
                else {
                    switch (choose) {
                        case 0:
                            System.out.println("Exit! Bye");
                            check = false;
                            break;
                        case 1:
                            System.out.println("Delete the First Element");
                            customLL.deleteBegin();

                            customLL.display();

                            System.out.println("Size of the Linked List after deleting the First element");
                            System.out.println(customLL.size());
                            break;
                        case 2:
                            System.out.println("Delete the Last Element");
                            customLL.deleteEnd();

                            customLL.display();

                            System.out.println("Size of the Linked List after deleting the Last element");
                            System.out.println(customLL.size());
                            break;
                        case 3:
                            System.out.println("Delete at the given index");
                            System.out.println("Enter the index where you want to delete");
                            int index = scan.nextInt();
                            customLL.deleteAtIndex(index);

                            customLL.display();

                            System.out.println("Size of the Linked List after deleting at the given index");
                            System.out.println(customLL.size());
                            break;
                        default:
                            System.out.println("Please press the numbers given in the options only");
                    }
                    if(customLL.size()!=0 && check) {
                        System.out.println("Enter your choice again");
                        choose = scan.nextInt();
                    }
                }
            }

    }
}
