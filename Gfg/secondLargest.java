package Gfg;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int ans = SecondLargest(arr);
        System.out.println(ans);
    }

    static int SecondLargest(int[] arr){
        int b1 = arr[0];
        int b2 = Integer.MIN_VALUE;
        for(int i =0; i<arr.length ;i++){
            if(arr[i] > b1){
                b2 = b1;
                b1 = arr[i];
            }

            if(arr[i] > b2 && arr[i] < b1){
                b2 = arr[i];
            }
            
        }

        return b2;
    }
}
