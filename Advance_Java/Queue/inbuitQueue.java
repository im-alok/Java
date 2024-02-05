package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class inbuitQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
