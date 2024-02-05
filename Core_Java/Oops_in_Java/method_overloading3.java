public class method_overloading3 {
    // Creteria for method overloading

    // 1.Two or more methods have same methods name.
    // 2.All the methods are should be in same class
    // 3.All the argument should be differnt:
    // a. Number of arguments
    // b. sequence of arguments
    // c. types of arguments

    // c. types of arguments

    static void main(String name) {
        System.out.println(name);
    }

    static void main(int age) {
        System.out.println(age);
    }

    public static void main(String[] args) {
        method_overloading3 ob2 = new method_overloading3();
        ob2.main("Alok Ranjan");
        ob2.main(18);
    }
}