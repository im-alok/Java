public class foreachloop {
    public static void main(String[] args) {
        int[] arr = { 2, 34, 4, 5, 6, 7, 8, 9, 0 };
        int sum = 0;
        for (int num : arr)
            sum = sum + num;
        System.out.println(sum);
    }

}
