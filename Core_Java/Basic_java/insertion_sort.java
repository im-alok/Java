public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 11, 7, 15, 22, 6, 26 };
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > temp)
                    arr[j + 1] = arr[j];
                else
                    break;
                j--;
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
