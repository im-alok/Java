
import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = input.nextInt();
        int i, j, k = 0;
        for (i = 1; i <= n; i++) {
            if (i <= (n + 1) / 2)
                k++;
            else
                k--;
            for (j = 1; j <= n; j++) {
                if (j >= ((n + 1) / 2 + 1) - k && j <= ((n + 1) / 2 - 1) + k)
                    System.out.print("*");

                else {
                    System.out.print(" ");
                }

            }

            System.out.println("");
        }

    }

}
