package com.akshet;

public class DoublyLL {

    private int size;
    private Node head;
    private Node tail;
    
    DoublyLL(){
        this.size=0;
    }

    //Adding at the End
    public void addEnd(int value){
        Node newNode = new Node(value);
        if(head==null)
            



    }


    //Displaying the List
    public void display(){
        if(head==null)
            System.out.println("Null");
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp+" -><- ");
                temp=temp.next;
            }
            System.out.print("End\n");
        }
    }

    private static class Node{
        private Node prev;
        private final int value;
        private Node next;

        Node(int value){
            this.value=value;
        }

    }
}
