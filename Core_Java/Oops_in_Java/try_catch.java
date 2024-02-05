import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the two number");
        num1 = input.nextInt();
        num2 = input.nextInt();

        try {
            int ans = num1 / num2;
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println("Exception Occurs");
        }
    }
}
