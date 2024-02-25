package Recursion;

public class naturalNumber {
    public static void main(String[] args) {
        printNumber(10);
    }

    static void printNumber(int n){
        if(n ==0)
            return;
        System.out.println(n);
        printNumber(n-1);
    }
}
