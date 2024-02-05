package Circularqueue;

import Queue.queueexception;

public class Circularqueuetest  {
    public static void main(String[] args) throws queueexception{
        Circularqueue queue =new Circularqueue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.display();

        queue.remove();

        queue.display();

        queue.add(133);
        queue.display();
        
    }
}
