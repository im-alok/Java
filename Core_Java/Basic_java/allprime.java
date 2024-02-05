import java.util.*;
public class allprime {
    public static void main(String[] args) {

        // taking inputfrom user
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the number upto which you want prime number");

        int n = data.nextInt();
        int i, j;
        System.out.println("Required prime number is:\n");
        for (i = 2; i <= n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }

            }
            if (j == i)
                System.out.print(" " + j);

        }

    }

}
