package com.akshet;

public class DoublyLL {

    private int size;
    private Node head;
    private Node tail;
    
    DoublyLL(){
        this.size=0;
    }
    //Size of the Doubly Linked List
    public int size(){
        return this.size;
    }
    //Adding at the End
    public void addEnd(int value){
        Node newNode = new Node(value);
        if(head==null) {
            head = newNode;
            tail=head;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size+=1;
    }


    //Displaying the List
    public void display(){
        if(head==null)
            System.out.println("Null");
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value+" -><- ");
                temp=temp.next;
            }
            System.out.print("End\n");
        }
    }

    //Adding at the Begin
    public void addBegin(int value){
        Node newNode = new Node(value);
        if(head==null) {
            head = newNode;
            tail=head;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size+=1;
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
