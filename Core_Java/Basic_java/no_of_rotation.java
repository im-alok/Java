public class no_of_rotation {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int pivot = highest_number(arr);
        System.out.print("No. of Rotation is:");
        System.out.print(pivot + 1);

    }

    static int highest_number(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            else if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            else if (arr[start] >= arr[mid])
                end = mid - 1;
            else if (arr[start] < arr[mid])
                start = mid + 1;
        }
        return -1;
    }

}
