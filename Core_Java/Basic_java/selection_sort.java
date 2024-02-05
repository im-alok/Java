public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 11, 7, 15, 22, 6, 26 };
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
