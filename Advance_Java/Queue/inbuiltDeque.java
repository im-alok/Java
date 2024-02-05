package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class inbuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(5);
        deque.addLast(9);
        deque.add(7);
         deque.addLast(11);
        
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque.getFirst());
        System.out.println(deque.containsAll(deque));
    }
}
