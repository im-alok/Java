package SingleLL;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}

public class singlylinkedlist {
    private static Node head;
    private static Node tail;

    public static void main(String[] args) {
        System.out.println("Select the following Operations:");
        System.out.println(
                "\n1.Creation of Linked list\n2.Insertion at First\n3.Insertion at any place in Linked List\n4.Insertion at Last\n5.Deletion at First\n6.Deletion at any place in Linked List.\n7.Deletion at Last\n8.Display\n9.EXIT");
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter you choice:");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    creattionofLL();
                    break;
                case 2:
                    insertatbeg();
                    break;
                case 3:
                    insertbetween();
                    break;
                case 4:
                    insertatlast();
                    break;
                case 5:
                    delatfirst();
                    break;
                case 6:
                    delbetween();
                    break;
                case 7:
                    delatlast();
                    break;
                case 8:
                    Display();
                    break;
                case 9:
                System.out.println();
                System.out.println();
                System.out.print("EXIT SUCCESSFULLY1");
                java.lang.System.exit(0);
                    break;
            }

        }
    }

    private static void Display() {
        if (head == null) {
            System.out.println("No Linked LIst Found,Create it First!!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("END");
        }
    }

    private static void delatlast() {
        if (head == null) {
            System.out.println("No Linked LIst Found,Create it First");
        } 
        else{
            Node temp = head;
            while ((temp.next).next != null)
                temp = temp.next;

            temp.next = null;
        }
    }

    private static void delbetween() {
        if (head == null) {
            System.out.println("No Linked LIst Found,Create it First!!");
        } 
        else{
            Scanner input = new Scanner(System.in);
            int pos;
            System.out.print("Enter the position from which you want to delete node:");
            pos = input.nextInt();
            if(pos==1){
                delatfirst();
            }
            else{
                Node temp = head;
                while (pos - 1 > 1) {
                    temp = temp.next;
                }
                temp.next = (temp.next).next;
            }
        }
    }

    private static void delatfirst() {
        if (head == null) {
            System.out.println("No Linked LIst Found,Create it First!!");
        } 
        else{
            Node temp=head;
            head=head.next;
            temp=null;

        }

    }

    private static void insertatlast() {
        if (head == null) {
            System.out.println("No Linked LIst Found,Create it First!!");
        } 
        else{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the element:");
            int data = input.nextInt();
            Node node = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
    }

    private static void insertbetween() {
        if (head == null) {
            System.out.println("No Linked LIst Found,Create it First!!");
        } 
        else{
            Scanner input = new Scanner(System.in);
            int data, pos;
            System.out.print("Enter the position at which you want to insert:");
            pos = input.nextInt();
            if(pos==1){
                insertatbeg();
            }
            else{
                System.out.print("Enter the data:");
                data = input.nextInt();
                Node temp = head;
                Node node = new Node(data);
                while (pos - 1 > 1) {
                    temp = temp.next;
                }
                Node store = temp.next;
                temp.next = node;
                node.next = store;
            }
        }
    }

    private static void creattionofLL() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of Linked List");
        int size = input.nextInt();
        int data;
        while (size > 0) {
            System.out.println("Enter the value");
            data = input.nextInt();
            Node node = new Node(data);

            node.next = head;
            head = node;
            size--;
        }
    }

    private static void insertatbeg() {
        if (head == null) {
            System.out.println("No Linked LIst Found");
        } 
        else{
            Scanner input = new Scanner(System.in);
            int data;
            System.out.print("Enter the value:");
            data = input.nextInt();
            Node node = new Node(data);

            node.next = head;
            head = node;
        }
    }
}
