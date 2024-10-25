package Tree;

import java.util.*;

public class treeInsertion {

    Node root = null;

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }
    }

    private void populate(Scanner scanner) {
        System.out.println("Enter the root node of your tree");
        int value = scanner.nextInt();
        Node node = new Node(value);
        root = node;

        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node root) {
        System.out.println("Do you want to enter to the left of " + root.value);
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value of the left node");
            Node node = new Node(scanner.nextInt());
            root.left = node;
            populate(scanner, node);
        }

        System.out.println("Do you want to enter the right part of " + root.value);

        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the right value of the node " + root.value);

            Node node = new Node(scanner.nextInt());
            root.right = node;

            populate(scanner, node);
        }
    }

    public void display() {
        display(root, 0);
    }

    public void display(Node node, int level) {
        if (node == null)
            return;

        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        display(node.left, level + 1);

    }

    // public void display(Node root){
    // if(root == null )
    // return;
    // System.out.println(root.value);
    // display(root.left);
    // display(root.right);
    // }

    public static void main(String[] args) {
        treeInsertion tree = new treeInsertion();
        Scanner scanner = new Scanner(System.in);

        tree.populate(scanner);
        tree.display();
    }
}
