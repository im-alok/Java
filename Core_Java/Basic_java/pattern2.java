import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = input.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j <= (n + 1) - i)
                    System.out.print("*");

                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
/* OUTPUT */
/*
      *****
      ****
      ***
      **
      *
 */
