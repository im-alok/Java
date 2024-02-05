import java.util.*;

public class spanofarray {

    public static int max(int[] arr) {
        int i, temp;
        temp = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (temp < arr[i])
                temp = arr[i];
        }
        return temp;

    }

    public static int min(int[] arr) {
        int i, temp;
        temp = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (temp > arr[i])
                temp = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int elements : arr) {
            System.out.printf(",");
            System.out.print(elements);
        }
        int spanofarray = max(arr) - min(arr);
        System.out.println("\nHence the span of the given arry is:");
        System.out.print(spanofarray);

    }

}
