
//Two ways to initialize the value to the instance variable
public class object {
    // using dot operator

    String name;
    int age;

    // using Method
    void getdata(String a, int b) {
        name = a;
        age = b;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("age:" + age);
    }
}

class assigning_data {
    public static void main(String[] args) {
        object obj = new object();
        obj.age = 18;
        obj.name = "Alok Ranjan";
        System.out.println("age:" + obj.age);
        System.out.println("Name" + obj.name);

        obj.getdata("Ayush Ranjan", 21);
        obj.display();

    }
}
