import java.util.*;

public class bit_manipulation3 {
    public static void main(String[] args) {
        // clear the bit:Make the bit zero if 1 is there;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();
        System.out.print("Enter the position where you want to find the bit:");
        int i = input.nextInt();
        // making mask;;
        int mask = ~(1 << i);
        int mask1 = 1 << i;
        int num = number;
        // Changinf if one is present
        if ((number & mask1) != 0) {
            number = number & mask;
            System.out.println();
            System.out.println();
            System.out.println("Checking whether the number get changed or not");
            System.out.println();
            if ((number & mask1) == 0)
                System.out.printf("Clear Successfully");
        } else
            System.out.printf("No need to change already zero is present");

    }
}