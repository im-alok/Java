package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q719 {
    public static void main(String[] args) {
        int arr[] ={1,3,1};
        int ans = new Solution().smallestDistancePair(arr, 1);
        System.out.println(ans);
    }
}

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums.length; i++){
            for(int j = i;j<nums.length;j++){
                arr.add(Math.abs(nums[i] - nums[j]));
            }
        }
        int n = arr.size();
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = arr.get(i);
        }

        Arrays.sort(ans);
        System.out.println(ans);

        return ans[ans.length - k];
    }
}
