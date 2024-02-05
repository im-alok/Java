
// SECOND ARRAY WILL ALWAYS GREATER THAN FIRDT ARRAY:
import java.util.*;

public class differenceofarray {
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
        int[] diff = new int[n2];
        int carry = 0;
        int a = array1.length - 1;
        int b = array2.length - 1;
        int c = diff.length - 1;
        while (c >= 0) {
            int d = 0;
            int array1_value = a >= 0 ? array1[a] : 0;
            if (array2[b] + carry >= array1_value) {
                d = array2[b] + carry - array1_value;
                carry = 0;
            } else {
                d = array2[b] + carry + 10 - array1_value;
                carry = -1;
            }
            diff[c] = d;
            a--;
            b--;
            c--;
        }

        int zero = 0;
        while (zero < diff.length) {
            if (diff[zero] == 0)
                zero++;
            else
                break;
        }
        while (zero < diff.length) {
            System.out.print(diff[zero]);
            zero++;
        }
    }
}
