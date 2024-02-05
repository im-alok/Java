package CircularLL;

public class Llist {
    public static void main(String[] args) {
        LL list = new LL();
        list.createLL(11);
        list.createLL(10);
        list.createLL(9);
        list.createLL(8);
        list.createLL(7);

        list.Display();
        System.out.println();
        list.InsertFirst(55);
        list.Display();

        list.InsertLast(369);
        System.out.println();
        list.Display();

        list.DeleteFirst();
        System.out.println();
        list.Display();


        list.DeleteLast();
        System.out.println();
        list.Display();
       // System.out.println(((list.tail).next).data);
        
    }

}
