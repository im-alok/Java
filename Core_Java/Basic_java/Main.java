class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 0 };
        sort012(arr, 7);
        for (int elements : arr) {
            System.out.println(arr);
        }
    }

    public static void sort012(int a[], int n) {
        // code here
        int i = 1;
        int start = 0, mid = 1, end = a.length - 1;
        while (start < end) {
            if (a[mid] > a[end]) {
                swap(a, mid, end);
                mid++;
            } else if (a[mid] < a[start]) {
                swap(a, mid, start);
                mid++;
            } else
                mid++;
            if (mid >= a.length - 1 - i) {
                start++;
                end--;
                mid = start + 1;
                i++;
            }
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}