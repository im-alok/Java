package Recursion;

import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) throws Exception {
        // write your code here
    try (
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i =0 ; i<array.length;i++)
                array[i] = sc.nextInt();
            displayArrReverse(array,0);
        }
    }
    

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length)
            return;
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
