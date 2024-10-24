package Core_Java.Locks;

public class SynchronizedKeyword {
    public static void main(String[] args) {
        // Display d = new Display();

        // Mythread t = new Mythread(d,"Dhoni");
        // Mythread t1 = new Mythread(d, "Yuvraj");
        // t1.start();
        // t.start();

        Display d1 = new Display();
        Display d2 = new Display();

        Mythread t1 = new Mythread(d1, "Dhoni");
        Mythread t2 = new Mythread(d1, "Yuvraj");
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

    public static synchronized void wish(String Name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning:");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }

            System.out.println(Name);
        }
    }
}




