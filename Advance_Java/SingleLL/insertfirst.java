package SingleLL;
public class insertfirst {
    private Node head;
    private Node tail;
    int size;

    public insertfirst() {
        this.size = 0;
    }
    // Creation Linked List

    void Insert(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        size = size + 1;
    }

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
}
