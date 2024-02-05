import java.util.Scanner;

public class IIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int n = input.nextInt();
        int k = n + 1;
        int i, j;
        for (i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                break;
            }

            k--;
            for (j = 1; j <= 3 * n + 2; j++) {
                if (j > n && j <= 2 * n + 2) {
                    if (i == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                else {
                    if (j >= n + 1 - i && j <= 3 * n + 3 - k)
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
