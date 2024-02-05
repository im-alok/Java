import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        String[] names = new String[n];
        System.out.println("Enter the heights:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the names:");
        {
            for (int i = 0; i < array.length; i++) {
                names[i] = input.next();
                input.nextLine();
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    // sorting names
                    String Temp = names[i];
                    names[i] = names[j];
                    names[j] = Temp;
                }
            }
        }
        for (int print : array)
            System.out.print(" " + print);
        System.out.println();

        for (String prints : names)
            System.out.println(" " + prints);

    }

}
