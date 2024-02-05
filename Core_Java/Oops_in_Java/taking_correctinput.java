import java.util.*;

public class taking_correctinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (!false) {
            try {
                int num = input.nextInt();
                System.out.println("You have entered:" + num);
            } catch (Exception e) {
                System.out.println("you did'nt entered Integer value Enter again!!");
                break;
            }
        }
    }

}
