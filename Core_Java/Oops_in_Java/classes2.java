
public class classes2 {
    String name;
    int age;

    void data(String a, int b) {
        this.name = a;
        this.age = b;
    }

    void display() {
        System.out.println("Name:" + name + " " + "age:" + age);
    }

}

class solution {
    public static void main(String[] args) {
        classes2 ob = new classes2();
        ob.data("Alok Ranjan", 18);
        ob.display();
        System.out.println();
        classes2 ob1 = ob;
        ob1.data("Ayush Ranjan", 20);
        ob1.display();
        System.out.println();
        ob.display();

    }
}