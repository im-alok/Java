package Gfg;

import java.util.ArrayList;

public class Array_Duplicates {

    //finding the element which is repeated more than once
    //constraints 0 < A[i] < n-1
    public static void main(String[] args) {
        int[] array = {2,3,1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();

        ans = duplicateElement(array);
        System.out.print(ans);
    }

    static ArrayList<Integer> duplicateElement(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int N = arr.length;

        for (int i =0; i < arr.length ; i++){
            arr[arr[i] % N] += N;
        }

        for(int i=0;i<N;i++){
            arr[i] /= N;
            if(arr[i] > 1)
                ans.add(i);
        }

        if(ans.size() <=0) ans.add(-1);

        return ans;
    }
}
