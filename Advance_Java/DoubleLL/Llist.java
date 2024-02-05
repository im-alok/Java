package DoubleLL;

public class Llist {
    public static void main(String[] args) {
        LL list = new LL();
        list.Create(65);
        list.Create(76);
        list.Create(25);

        list.Display();
        System.out.println();

        list.createLL(66);
        list.Display();
        System.out.println();

        list.Insertfirst(99);
        list.Display();
        System.out.println();

        list.InsertLast(88);
        list.Display();
        System.out.println();

        list.InsertBetweeen(69, 2);
        list.Display();
        System.out.println();

        list.DeleteFirst();
        list.Display();
        System.out.println();

        list.DeleteLast();
        list.Display();
        System.out.println();

        list.DeleteBetween(3);
        list.Display();
        System.out.println();

        list.DisplayReverse();

    }
}
