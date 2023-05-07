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

    // Delete at the Beginning
    public void deleteBegin(){
        if(tail == null || head == null) {
            System.out.println("Can not delete as No element was found!");
            return;
        }else {
            Node temp = head;
                if (temp.next != null)
                    head = temp.next;
                else
                    head = null;
            }
            size -= 1;
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

    // Delete at the End
    public void deleteEnd(){
        if(tail == null || head == null) {
            System.out.println("Can not delete as No element was found!");
            return;
        }else {
            Node temp = head;
            if (temp.next != null) {
                while (temp.next != tail) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
            }else
                head=null;
        }
        size -= 1;
    }

    // Display the linked List
    public void display(){
        Node temp = head;
        if(temp==null)
            System.out.println("null ");
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

    public void deleteAtIndex(int index) {
        if(index==0)
            deleteBegin();
       else if(index==size()-1)
            deleteEnd();
       else if(head ==null || tail ==null)
            System.out.println("Not Possible, the List is empty");
        else if(index>=size())
            System.out.println("Not Possible as Index was not found!");
        else{
            int count =1;
            Node temp = head;
            while(count<index){
                temp=temp.next;
                count++;
            }
            // or we do by this way also
            //temp.next=temp.next.next;

            Node rmv = temp.next;
            temp.next= rmv.next;
            size-=1;
        }
    }

    // First Method
  /*  public void reverse() {
        if(size()==0){
            System.out.println("The List is Null!");
            return;
        }
        if(size()==1) {
            return;
        }
        Node from = head;
        Node to = tail;
        int size =1;
        while(size<=size()/2){
            swap(from,to);
            from=from.next;
            Node temp =from;
            if(size!=size()/2) {
                while (temp.next != to) {
                    temp = temp.next;
                }
                to = temp;
            }
            size++;
        }
    }*/

    //Second Method
    // Without Using tail
    public void reverse(){
        Node current = head;
        Node next;
        Node prev= null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    private void swap(Node from, Node to) {
        int temp = from.value;
        from.value=to.value;
        to.value=temp;
    }


    // Making a particular node class
    // Most of the time inner class can be treated as Static
    private static class Node{
        private int value;
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
