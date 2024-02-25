package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int s=0;
        int e = arr.length-1;
        int target = 6;
        System.out.println(search(arr, target, s, e));
    }
    static int search(int[] arr,int target,int s,int e){

        if(s>e)
            return -1;
        int m = s + (e-s)/2;
        if(arr[m] == target){
            System.out.println("Index founded");
            return m;
        }
        
        if(arr[m]<target){
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
        

    }
}
