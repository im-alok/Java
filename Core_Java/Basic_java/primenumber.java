import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Enter the numnber");
        int number = enter.nextInt();
        int i;
        for (i = 2; i < number; i++) {

            if (number % i == 0) {
                System.out.print(number);
                System.out.println(" is not prime number");
                break;
            }

        }
        if (i == number) {
            System.out.print(number);
            System.out.println(" is prime number");
        }

    }
}
