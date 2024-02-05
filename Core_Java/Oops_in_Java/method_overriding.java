public class method_overriding {
    // method overriding can be achieve through th following steps::
    // 1. Two or more methods have same name
    // 2. classes of method show bw different
    // 3. arguments should be same
    // a. no. of arguments
    // b. Types of arguments
    // c.sequences of agruments
    // 4.Having inheritance

    // no. of arguments
    public static void main(String[] args) {
        ans ob1 = new ans();
        ob1.calculator(2, 5);

        method_overriding ob = new method_overriding();
        ob.calculator(3, 2);
    }

    void calculator(int a, int b) {
        System.out.println("Addition:" + (a + b));
        System.out.println("Subtraction:" + (a - b));
    }

}

class ans extends method_overriding {

    void calculator(int a, int b) {
        float y = (float) a / b;
        System.out.println("multiplication:" + a * b);
        System.out.println("Division:" + (y));
    }

}

class Solution {

}