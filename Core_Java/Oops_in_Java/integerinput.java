import java.util.*;

public class integerinput {
    public static void main(String[] args) {
        boolean flag;

        int num = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                num = input.nextInt();
                flag = false;

            } catch (Exception e) {
                System.out.println("Enter the correct integer value only" + e);
                flag = true;
            }
        } while (flag);
        System.out.println("The Integer Value is:" + num);
    }
}
