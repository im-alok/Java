package SingleLL;
public class insertlast {
    private Node head;
    private Node tail;
    int size;

    public insertlast() {
        this.size = 0;
    }

    void Insestlast(int data) {
        // getting the last Node
        Node alt = head;
        if (alt == null) {
            System.out.println("No element is there so Inserting at first Position");
           //insert it at first position;
        }

        else {
            while (alt.next != null) {
                alt = alt.next;
            }

            Node last = new Node(data);
            // assigning the data to the last node
            last.next = null;
            alt.next = last;
            size = size + 1;
        }

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
