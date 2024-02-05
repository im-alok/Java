
import java.util.*;

public class inversenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // FINDING INVERSE OF A NUMBER

        System.out.println("Enter the number\n");
        int num = input.nextInt();
        int pi, ni, pd, nd, inv;
        pi = 1;
        inv = 0;
        /*
         * pi=previous index ni=new index pd=previous digit nd=new digit inv=inverse of
         * a nmber
         */
        while (num != 0) {

            nd = pi;
            pd = num % 10;
            ni = pd;
            inv = inv + pi * (int) Math.pow(10, pd - 1);
            // increasing the of previous index
            num = num / 10;
            pi++;

        }
        System.out.println("Numbe after inverse is: ");
        System.out.print(inv);

    }
}