import java.util.Arrays;

public class majority_element {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3, 2 };
        Arrays.sort(arr);
        int i, count = 1, ans = 0, ans_count = 1;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;

            } else {
                ans_count = count;
                ans = arr[i - 1];
                count = 1;
            }
        }
        if (ans_count > arr.length / 2)
            System.out.println(ans);
        System.out.println("-1");
    }

}
