

abstract class Vehicle {
    int no_of_tyres;

    abstract void start();

    abstract void price();

    void whichtype() {
        System.out.println("Petrol Type");
    }
}

class car extends Vehicle {
    public void start() {
        System.out.println("Start with the Help of key");
    }

    public void price() {
        System.out.println("It is of 2600000");
    }
}

public class abstractionclass {
    public static void main(String[] args) {
        car Maruti = new car();
        Maruti.start();
        Maruti.price();
        Maruti.whichtype();
    }
}
