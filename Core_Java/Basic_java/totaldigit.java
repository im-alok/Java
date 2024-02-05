import java.util.Scanner;

public class totaldigit {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = data.nextInt();
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;

        }
        System.out.println(count);

    }

}
