public class method_overriding2 {
    // method overriding can be achieve through th following steps::
    // 1. Two or more methods have same name
    // 2. classes of method show bw different
    // 3. arguments should be same
    // a. no. of arguments
    // b. Types of arguments
    // c.sequences of agruments
    // 4.Having inheritance

    // b. Types of arguments
    public static void main(String[] args) {
        method_overriding2 ob1 = new method_overriding2();
        ob1.aadharcard("Alok Ranjan", 18);

        pancard on = new pancard();
        on.aadharcard("Ayush Ranjan", 19);
    }

    void aadharcard(String name, int age) {
        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
    }

}

class pancard extends method_overriding2 {
    void aadharcard(String name, int age) {
        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
    }
}
