// Creteria for method overloading

// 1.Two or more methods have same methods name.
// 2.All the methods are should be in same class
// 3.All the argument should be differnt:
// a. Number of arguments
// b. sequence of arguments
// c. types of arguments

// b. sequence of arguments
public class method_overloading {
    void getdata(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    void getdata(int age, String name) {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        method_overloading ob = new method_overloading();
        ob.getdata("Alok Ranjan", 18);
        ob.getdata(19, "Ayush Ranjan");
    }
}
