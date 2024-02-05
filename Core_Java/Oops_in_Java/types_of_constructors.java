
public class types_of_constructors {
    // In java there are three types of constructors
    // 1. Default constructors
    // 2. User defined non-Parameterised constructors
    // 3. user defined paramatersied constructors
    int length;
    int breadth;

    // default constructors created by compiler by own

    // parameterised constructors
    types_of_constructors(int l, int b) {
        length = l;
        breadth = b;
    }

    void perimeter() {
        System.out.println(2 * length + 2 * breadth);
    }
}

class perimeter {
    public static void main(String[] args) {
        types_of_constructors ob1 = new types_of_constructors(20, 15);
        ob1.perimeter();
    }
}
