import java.util.*;

public class pythagoreantriplate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if ((int) Math.pow(num1, 2) + (int) Math.pow(num2, 2) == (int) Math.pow(num3, 2)
                || (int) Math.pow(num1, 2) + (int) Math.pow(num3, 2) == (int) Math.pow(num2, 2)
                || (int) Math.pow(num2, 2) + (int) Math.pow(num3, 2) == (int) Math.pow(num1, 2)) {
            System.out.println("GIVEN Three Number Is In Pythagrous Triplet");
        } else
            System.out.println("GIVEN Three Number Is Not In Pythagrous Triplet");
    }

}
