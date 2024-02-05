
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int terms = data.nextInt();
        int i, a = 0, b = 1, c;
        System.out.printf("%d %d", a, b);
        for (i = 1; i <= terms - 2; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;

        }

    }
}
