public class cyclesort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 3, 5 };
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (i < arr.length && correct != i) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }

            else
                i++;

        }
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
