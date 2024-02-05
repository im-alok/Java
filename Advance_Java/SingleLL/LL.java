package SingleLL;

public class LL {
    private Node head;
    private Node tail;
    int size;

    public LL() {
        this.size = 0;
    }
    // Creation Linked List

    void Insert(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        size = size + 1;
    }
    // Displaying Java

    void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    // Inserting element at Last Position

    void Insertlast(int data) {
        // getting the last Node
        Node alt = head;
        if (alt == null) {
            System.out.println("No element is there so Inserting at first Position");
            Insert(data);
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

    void Insertbetween(int data, int position) {
        if (size == 0)
            System.out.println("Gadaari karbe,tori behin ke chodo");
        else if (position > size)
            System.out.println("Chal bhosdike,Nahi karunga");
        else if (position == 1) {
            Insert(data);
        } else if (position == size)
            Insertlast(data);
        else {
            Node temp = head, store;
            Node in = new Node(data);
            while (position - 1 > 1) {
                temp = temp.next;
                position--;
            }
            store = temp.next;
            temp.next = in;
            in.next = store;
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

// Position : Place where entry has to be done