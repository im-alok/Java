
// Finding the index of the target without knowing the  length of the array::
import java.util.*;

public class index_using_BS {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 5, 6, 8, 9, 12, 13, 16, 18, 19, 22, 45, 67, 89 };
        int target = 19;
        // Moving through the chunks
        // 1st we check the array with size 2 then we gradually increases the size of
        // multiple of 2
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;

        }
        int ans = Binary_Search(arr, target, start, end);
        System.out.print("Ans is:");
        System.out.println(ans);
    }

    static int Binary_Search(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
        }
        return -1;
    }

}
