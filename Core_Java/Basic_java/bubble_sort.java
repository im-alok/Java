public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int i, j;
        for (i = 0; i < arr.length - 1; i++)
            for (j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j])
                    swap(arr, i, j);

        for (i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
