import java.util.*;

public class primefactorization {
    public static void main(String[] args) {
        int i, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        System.out.print("prime factorization of the given number is: ");
        temp = num;
        for (i = 2; i < num; i++) {
            while (temp % i == 0) {

                temp = temp / i;
                System.out.printf("%d ", i);

            }
        }

    }

}
