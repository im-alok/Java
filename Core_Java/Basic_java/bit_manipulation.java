import java.util.*;

public class bit_manipulation {
    public static void main(String[] args) {
        // Find which bit is present in the ith position of the number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();
        System.out.print("Enter the position where you want to find the bit:");
        int i = input.nextInt();
        // making mask;;
        int mask = 1 << i;
        if ((number & mask) != 0)
            System.out.printf("At the %d postion 1 is present", i);
        else
            System.out.printf("At the %d postion 0 is present", i);

    }

}
