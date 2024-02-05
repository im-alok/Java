package SingleLL;
public class insertbetween {
    private Node head;
    private Node tail;
    int size;

    public insertbetween() {
        this.size = 0;
    }
    
// Position : Place where entry has to be done
    void Insertbetween(int data, int position) {
        if (size == 0)
            System.out.println("Gadaari karbe,tori behin ke chodo");
        else if (position > size)
            System.out.println("Chal bhosdike,Nahi karunga");
        else if (position == 1) {
           System.out.println("Insert data at 1st position");
        } else if (position == size)
        System.out.println("Insert data at last position");
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
}
