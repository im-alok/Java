package Recursion;
import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner ipt = new Scanner(System.in);
        int n = ipt.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }

}