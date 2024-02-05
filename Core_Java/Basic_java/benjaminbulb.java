import java.util.*;

public class benjaminbulb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of bulbs and enter the number of times it get fluctuate:");
        int n = input.nextInt();
        System.out.println("Number of bulb remain on after fluctuate is:");
        for (int i = 1; i * i <= n; i++) {
            System.out.print(" " + (i * i));
        }

    }

}
