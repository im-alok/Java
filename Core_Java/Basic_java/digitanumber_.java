import java.util.*;

public class digitanumber_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int rem, rev, n, temp, nod = 0;
        n = number;
        temp = n;

        while (number != 0) {
            rev = number % 10;
            System.out.println(rev);
            number = number / 10;

        }

        // printing it in same order
        System.out.println("PRINTING IN THE SAME ORDER AS NO.");
        while (temp != 0) {

            temp = temp / 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);

        while (n != 0) {
            rem = n / div;
            System.out.println(rem);

            n = n % div;
            div = div / 10;

        }

    }

}
