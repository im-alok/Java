import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rev, rem = 0;
        while (num != 0) {

            rev = num % 10;
            rem = rem * 10 + rev;
            num = num / 10;
        }
        System.out.println(rem);
    }

}
