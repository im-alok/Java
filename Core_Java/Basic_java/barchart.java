import java.util.*;

public class barchart {
    public static void main(String[] args) {
        Scanner inpit = new Scanner(System.in);
        System.out.println("Enter the number of element of the array:");
        int input = inpit.nextInt();
        int[] array = new int[input];
        // Assigning value to array
        for (int i = 0; i < array.length; i++) {
            array[i] = inpit.nextInt();
        }
        // printing bar charts
        int temp;
        temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (temp < array[i])
                temp = array[i];
        }
        for (int floor = temp; floor >= 1; floor--) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= floor)
                    System.out.print("*  ");
                else
                    System.out.print("");
            }
            System.out.println("");
        }
    }
}
