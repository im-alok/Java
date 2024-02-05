public class method_overloading2 {
    // Creteria for method overloading

    // 1.Two or more methods have same methods name.
    // 2.All the methods are should be in same class
    // 3.All the argument should be differnt:
    // a. Number of arguments
    // b. sequence of arguments
    // c. types of arguments

    // a. Number of arguments
    static void getdata(int a) {
        System.out.println(a);
    }

    static void getdata(int a, int b) {
        System.out.print(a + " " + b);
    }

    public static void main(String[] args) {
        method_overloading2 ob1 = new method_overloading2();
        ob1.getdata(2);
        ob1.getdata(2, 3);
    }
}
