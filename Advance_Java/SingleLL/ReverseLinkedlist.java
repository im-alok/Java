package SingleLL;

public class ReverseLinkedlist {
    private Node head;
    private class Node { // Class is Private so that no one can access from outside
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void Reverse() {
        Node temp, lost;
        temp = head.next;
        head.next = null;
        while (temp != null) {
            lost = temp.next;
            temp.next = head;
            head = temp;
            temp=lost;
        }
    }
}
