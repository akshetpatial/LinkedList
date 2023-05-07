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
            tail=newNode;
        }
        size+=1;
    }

    public void addBegin(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
        size+=1;
    }

    public void AddAtIndex(int index, int val) {
        if(index==0) {
            addBegin(val);
            return;
        }
        if(index==size()-1){
            addEnd(val);
            return;
        }
        if(index>=size()){
            System.out.println("Not Possible Index Out of Bound!");
            return;
        }
        Node temp = head;
        Node newNode = new Node(val);
        int count=1;
        while(count<index){
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size+=1;
    }

    public void deleteEnd() {
        Node temp = head;
        if(temp==null){
            System.out.println("List is Null!");
            return;
        }
        if(temp.next==temp){
            head=null;
            size-=1;
            return;
        }
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
        size-=1;
    }

    public void deleteBegin() {
        Node temp = head;
        if(temp==null){
            System.out.println("List is Null!");
            return;
        }
        if(temp.next==temp){
            head=null;
            size-=1;
            return;
        }
        tail.next=temp.next;
        head=temp.next;
        size-=1;
    }

    public void deleteAtIndex(int index) {
        if(index==0) {
            deleteBegin();
            return;
        }
        if(index==size()-1){
           deleteEnd();
            return;
        }
        if(index>=size()){
            System.out.println("Not Possible Index Out of Bound!");
            return;
        }
        Node temp = head;
        int count=1;
        while(count<index){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        size-=1;
    }

    public void display() {
        Node temp = head;
        if(temp==null) {
            System.out.println("Null");
            return;
        }
        while(temp!=tail){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.value+"-> Start From head -> "+temp.next.value+"\n");
    }

    public int size() {
        return size;
    }

    private static class Node{
     private int value;
     private Node next;

     Node(int value){
         this.value =value;
     }

    }

}
