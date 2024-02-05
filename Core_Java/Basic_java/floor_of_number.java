import java.util.*;

public class floor_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 4;
        int ans = Required_ceiling(arr, target);
        if (ans < 0)
            System.out.println("Element is not present!");
        else
            System.out.println(arr[ans]);
    }

    static int Required_ceiling(int[] arr, int target) {
        int end = arr.length;
        int start = 0;
        if (target < arr[0])
            return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
        }
        return end;
    }
}
