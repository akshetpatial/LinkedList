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

    //Add at the Given Index
    public void AddAtIndex(int index, int value) {
        Node newNode = new Node(value);
        if(index==0)
            addBegin(value);
        else if (index==size()-1)
            addEnd(value);
        else if(index>=size())
            System.out.println("Not Possible!");
        else{
            Node temp = head;
            int count=1;
            while(count<index){
                temp=temp.next;
                count++;
            }
            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;
            newNode.prev=temp;
            size+=1;
        }
    }

    public void deleteEnd() {
        if(head==null || tail==null)
            System.out.println("Not Possible as the List is empty");
        else{
            if(size()==1){
                head=null;
                tail=null;
            }else{
                tail=tail.prev;
                tail.next=null;
            }
            size-=1;
        }
    }

    public void deleteBegin() {
        if(head==null || tail==null)
            System.out.println("Not Possible as the List is empty");
        else{
            if(size()==1){
                head=null;
                tail=null;
            }else{
               head=head.next;
               head.prev=null;
            }
            size-=1;
        }
    }

    public void deleteAtIndex(int index) {
        if(index==0)
            deleteBegin();
        else if (index==size()-1)
            deleteEnd();
        else if(index>=size())
            System.out.println("Not Possible!");
        else{
            Node temp = head;
            int count=1;
            while(count<index){
                temp=temp.next;
                count++;
            }
            Node nextNode = temp.next.next;
            temp.next=nextNode;
            nextNode.prev=temp;
            size-=1;
        }
    }

    // Reverse a Linked List
    public void reverse() {
        if(size==0){
            System.out.println("The List is Null!");
            return;
        }
        if(size()==1) {
            return;
        }
            Node from = head;
            Node to = tail;
            int size =1;
       //    This will not work for Even elements in the List
        //     while (from != to){
                while (size<=size()/2){
                swap(from,to);
                from=from.next;
                to=to.prev;
                size++;
        }
    }

    private void swap(Node from, Node to) {
        int temp = from.value;
        from.value=to.value;
        to.value=temp;
    }

    private static class Node{
        private Node prev;
        private int value;
        private Node next;

        Node(int value){
            this.value=value;
        }

    }
}
