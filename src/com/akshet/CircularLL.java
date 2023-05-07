package com.akshet;

public class CircularLL {

    private int size;
    private Node head;
    private Node tail;

    CircularLL(){
        size=0;
    }

    public void addEnd(int val) {
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next=newNode;
            newNode.next=head;
        }
        size+=1;
    }

    public void addBegin(int val) {
    }

    public void AddAtIndex(int index, int val) {
    }

    public void deleteEnd() {
    }

    public void deleteBegin() {
    }

    public void deleteAtIndex(int index_1) {
    }

    public void reverse() {
    }

    public void display() {
        Node temp = head;
        if(temp==null) {
            System.out.println("Null");
            return;
        }
        while(temp!=tail){
            System.out.print(temp+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.next+"-> Start From head -> "+temp.next.next);
    }

    public int size() {
        return size;
    }

    private static class Node{
     private static int value;
     private Node next;

     Node(int value){
         Node.value =value;
     }

    }

}
