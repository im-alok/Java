package Queue;

public class customqueuetest {
    public static void main(String[] args) throws queueexception {
        Dynamicqueue queue =new Dynamicqueue(5);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        System.out.println(queue.add(10));
        // System.out.println("Getting Peek elements");
        // System.out.println(queue.peek());

        // queue.remove();
        // System.out.println(queue.peek());
        // System.out.println();
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

    }
}
