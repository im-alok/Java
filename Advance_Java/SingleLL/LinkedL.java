package SingleLL;

public class LinkedL {
    private Node head;
    private Node tail;

    void create(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=head;
        }
        else {
            tail.next=node;
            tail=node;
        }
    }
    void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    private class Node{
        int data;
        Node next;
    
        private Node(int data){
            this.data=data;
        }
        private Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
