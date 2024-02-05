
public class constructors {
    String name;
    int age;

    constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class gettingdata {
    public static void main(String[] args) {
        constructors obj = new constructors("Alok Ranjan", 19);
        constructors obj1 = new constructors("Ayush Ranjan", 21);
        System.out.println("Name" + "\t\t\t" + "age");
        System.out.println(obj.name + " " + "\t\t" + obj.age);
        System.out.println(obj1.name + "\t\t" + obj1.age);
    }
}
