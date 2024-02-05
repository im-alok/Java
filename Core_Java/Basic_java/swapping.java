import java.util.ArrayList;
import java.util.*;

public class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of elemnts in the array:");
        int temp;
        int number = input.nextInt();
        ArrayList<Integer> Swapping = new ArrayList<>();
        ArrayList<Integer> Temp = new ArrayList<>();
        for (int i = 0; i < number; i++)
            Swapping.add(input.nextInt());

        for (int i = 0; i < number; i++)
            Temp.add(0);

        for (int i = 0; i < number; i++)
            Temp.set(i, Swapping.get(i));

        // for (int i = 0; i < number; i++)
        // System.out.print(" " + Swapping.get(i));

        for (int i = 0; i < number / 2; i++)
            Swapping.set(i, Swapping.get(number - i - 1));

        for (int i = 0; i < number / 2; i++)
            Swapping.set(number - 1 - i, Temp.get(i));

        System.out.println();
        for (int i = 0; i < number; i++)
            System.out.print(" " + Swapping.get(i));

    }

}
