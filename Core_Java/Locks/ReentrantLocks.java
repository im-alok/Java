package Core_Java.Locks;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks {
    public static void main(String[] args) {
        
        Display d1 = new Display();
        Display d2 = new Display();

        Mythread t1 = new Mythread(d1, "Dhoni");
        Mythread t2 = new Mythread(d2, "Yuvraj");
        t1.start();
        t2.start();
    }
}

class Mythread extends Thread {
    Display d;
    String Name;

    Mythread(Display d, String Name) {
        this.d = d;
        this.Name = Name;
    }

    public void run() {
        d.wish(Name);
    }
}

class Display {

    ReentrantLock l = new ReentrantLock();

    public void wish(String Name) {
        l.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning:");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }

            System.out.println(Name);
        }
        l.unlock();
    }
}