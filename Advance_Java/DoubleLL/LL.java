package DoubleLL;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    void createLL(int data) {// creating it in Backward way
        Node node = new Node(data);
        node.next = head;
        if (head != null)
            head.prev = node;
        head = node;
    }

    void Create(int data) {// Creating in forward way
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;

        }
    }

    void Insertfirst(int data) {
        Node node = new Node(data);
        head.prev = node;
        node.next = head;
        node.prev = null;
        head = node;

    }

    void InsertBetweeen(int data, int pos) {
        Node node = new Node(data);
        Node temp = head;
        while (pos - 2 > 0) {
            temp = temp.next;
        }
        node.next=temp.next;
        (temp.next).prev=node;
        node.prev=temp;
        temp.next=node;
    }

    void InsertLast(int data){
        Node node=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
        tail=node;

    }
    void DeleteFirst(){
        head=head.next;
        head.prev=null;
    }
    void DeleteLast(){
        tail=tail.prev;
        tail.next=null;
    }

    void DeleteBetween(int pos){
        Node temp=head;
        while(pos-2>0){
            temp=temp.next;
            pos--;
        }
        Node delnode=temp.next;
        temp.next=delnode.next;//adding address of next to deleted node
        (delnode.next).prev=temp;//Adding address of previous of deleted node in next of deleted Node

        delnode=null;


    }
    void DisplayReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.print("FIRST");
    }

    void Display() {
        if (head == null) {
            System.out.println("No Linked List Found,Create it First!!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("END");
        }
    }

      private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
