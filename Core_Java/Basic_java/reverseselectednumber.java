import java.util.*;

public class reverseselectednumber {
    // counting the digit of a number
    public static int Digit(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return (count);

    }
    // main program

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {

            System.out.print("enter the number:");
            int num = input.nextInt();
            System.out.print("Enter the count of number which you want to interchange:");
            int rotation = input.nextInt();
            int rev, New, temp, zero = 1, newnumber;
            temp = num;
            New = num;

            zero = (int) Math.pow(10, rotation);

            rev = num % zero;
            newnumber = rev * (int) Math.pow(10, Digit(temp) - rotation) + New / (int) Math.pow(10, rotation);

            System.out.print("The required number is:");
            System.out.println(newnumber);
            System.out.println("press 1 to continue and 0 to exit");
            choice = input.nextInt();
        }

    }
}
/* 0Explanation of code */
/*
 * 1.the number given is divided by 10 to the power of the rotation and get the
 * remainder (using % operator)(line29 and 31)
 */
/*
 * 2.then the remainder is multiply by the 10 to the power of (number of digit
 * of the given number-the number of rotation) (line 32)
 */
/*
 * 3. then the number is again divided by10 to the power of rotation (line 32)
 */
/* 4. add 2 and 3 to get the output */