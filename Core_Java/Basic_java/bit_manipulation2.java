import java.util.*;

public class bit_manipulation2 {
    public static void main(String[] args) {
        // set the bit to 1 it 0 is present if there is 1 ignore it
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();
        System.out.print("Enter the position where you want to find the bit:");
        int i = input.nextInt();
        // making mask;;
        int mask = 1 << i;
        int num = number;
        if ((num & mask) != 0)
            System.out.printf("At the %d postion 1 is present", i);
        else
            System.out.printf("At the %d postion 0 is present", i);

        number = number | mask;
        System.out.println();
        System.out.println("Checking whether the number get changed or not");
        if ((number & mask) != 0)
            System.out.printf("At the %d postion now  1 is present", i);
        else
            System.out.printf("At the %d postion 0 is present", i);

    }

}
