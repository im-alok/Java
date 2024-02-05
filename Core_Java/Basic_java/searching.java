
//Linear Search
import java.util.*;

public class searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Enter the number of element");
        int n = input.nextInt();
        System.out.println("Enter the element you want to search:");
        int k = input.nextInt();
        int[] array = new int[n];
        if (array.length == 0)
            System.out.println("NO element is found");
        for (i = 0; i < n; i++)
            array[i] = input.nextInt();
        for (i = 0; i < n; i++)
            if (array[i] == k) {
                System.out.println("the Required number is found at index: " + i);
                break;
            }
        if (i == k)
            System.out.println("the given number is not present in the array!");
    }
}
