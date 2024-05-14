package Hashmap;

import java.util.HashMap;

public class CommonElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,5};
        int[] arr2 = {1,1,1,2,2,4,3,5};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(hm.containsKey(arr2[i])){
                hm.put(arr2[i], hm.get(arr2[i]) + 1 );
            }
        }

        for(int key:hm.keySet()){
            if(hm.get(key) > 1)
                System.out.print(key + " ");
        }

    }
}
