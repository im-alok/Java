package CircularLL;

public class LL {
    Node head;
    Node tail;

    void createLL(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        }

        else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    void Display() {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data + "->HEAD");
    }

    void InsertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        tail.next = node;
        head = node;

    }

    void InsertLast(int data){
        Node node=new Node(data);
        tail.next=node;
        node.next=head;
        tail=node;
    }
    
    void InsertBetween(){
        //Same as single Linked list
    }

    void DeleteFirst(){
        tail.next=head.next;
        head=head.next;
    }

    void DeleteLast(){
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
    }
    void DeleteBetween(){
        //Same as Single Linkedlist
    }
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}
