package Recursion;

import java.util.Scanner;

public class PrintingArray {
    public static void main(String[] args) throws Exception {
        try (// write your code here
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i =0 ; i<array.length;i++)
                array[i] = sc.nextInt();
            displayArr(array,0);
        }
    }

    public static void displayArr(int[] arr, int idx){
        if(idx >= arr.length)
            return;
        System.out.println(arr[idx]);
        displayArr(arr,idx + 1);
    }
}
