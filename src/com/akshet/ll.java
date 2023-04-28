package com.akshet;

public class ll {

    private int size;
    private Node head;
    private Node tail;


    // Creating a default constructor so that the size should be zero when we are initializing it first
    public ll(){
        this.size=0;
    }

  /*  public Node lastElement(){
        Node temp = head;
        while (temp!=null){
            temp=temp.next;
        }
        return temp;
    }
*/
    // Add at the Beginning
    public void addBegin(int value){
        Node node = new Node(value);
        if(head!=null){
            node.next=head;
        }
        head=node;
        size+=1;

        if(tail == null)
            tail=head;

    }

    // Return Size of the Linked List
    public int size(){
        return this.size;
    }

    // Add at the end
    public void addEnd(int value){
        Node node = new Node(value);
        if(head==null)
            head=node;

        if(tail!=null){
            tail.next= node;
        }
        tail=node;
        size+=1;
    }

    // Display the linked List
    public void display(){
        Node temp = head;
        if(temp==null)
            System.out.println(" null ");
        else {
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.print("END\n");
        }
    }

    public void addAtIndex(int Index, int value) {

        if(Index==0){
            addBegin(value);
            return;
        }
        if(Index==size()-1){
            addEnd(value);
            return;
        }
        if(Index>=size()){
            System.out.println("Not Possible! As that Index Does not exists ");
            return;
        }
        Node temp = head;
        Node newNode = new Node(value);
        int count=1;
        while(count<Index){
           temp=temp.next;
            count++;
        }
        Node after;
        if(temp.next!=null) {
            after = temp.next;
        }else{
            after =null;
        }
        size+=1;
        temp.next=newNode;
        newNode.next=after;
    }


    // Making a particular node class
    // Most of the time inner class can be treated as Static
    private static class Node{
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }


}