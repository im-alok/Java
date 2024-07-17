package Gfg;

import java.util.HashMap;

public class SubsetArray {
    public static void main(String[] args) {
        Compute obj = new Compute();
        long[] a1 = {84,84849,9592,99,848,843,959,5484 };
        long[] a2 = {5484,959,99,84};

        String ans = obj.isSubset(a1,a2);
        System.out.println(ans);
    }
}

class Compute {
    public String isSubset( long a1[], long a2[]) {
        HashMap<Long, Integer> mp = new HashMap<>();
        
        for(int i =0 ;i<a1.length;i++){
            mp.put(a1[i], mp.getOrDefault(a1[i],Integer.valueOf(0)) + 1);
        }
        
        for(int i =0 ;i<a2.length;i++){
            if(mp.getOrDefault(a2[i],Integer.valueOf(0)) <=0)
                return "No";
            else{
                mp.put(a1[i], mp.get(a2[i]) -  1);
            }
        }
        return "Yes";
    }
}