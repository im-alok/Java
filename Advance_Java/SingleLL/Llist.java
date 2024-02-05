package SingleLL;
public class Llist {
    public static void main(String[] args) {
        LL list = new LL();
        list.Insert(2);
        list.Insert(11);
        list.Insert(5);
        list.Insert(7);
        list.Insert(9);
        list.Display();
        System.out.println();

        list.Reverse();
        list.Display();
      
    }

}
