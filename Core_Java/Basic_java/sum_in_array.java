
import java.util.*;

public class sum_in_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the amount of number which you want to be entered:");
        n1 = input.nextInt();
        int[] array1 = new int[n1];
        // Entering the elem,ent in the array
        System.out.println("Enter the number:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }
        // FOR SECOND ARRAY
        System.out.println("Enter the amount of number which you want to be entered(2nd):");
        n2 = input.nextInt();
        int[] array2 = new int[n2];
        // Entering the elem,ent in the array
        System.out.println("Enter the numbers:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int carry = 0;
        int a = array1.length - 1;
        int b = array2.length - 1;
        int c = sum.length - 1;
        while (c >= 0) {
            int d = carry;
            if (a >= 0)
                d = d + array1[a];
            if (b >= 0)
                d = d + array2[b];
            carry = d / 10;
            d = d % 10;
            sum[c] = d;
            a--;
            b--;
            c--;
        }
        if (carry != 0)
            System.out.print(carry);
        for (int element : sum)
            System.out.print(element);
    }
}