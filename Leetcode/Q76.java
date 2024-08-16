package Leetcode;

import java.util.HashMap;

public class Q76 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "b";
        String sol = new Solution().minWindow(s, t);
        System.out.print(sol);
    }
}

class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> ani = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int range1=-1,range2=-1;

        //adding all the string of t in map to check if present in s or not

        for(int i = 0;i<t.length();i++){
            ani.put(t.charAt(i),ani.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        //track whether we got all the charcter of t
        int got = 0, total = ani.size();

        //now iterating over the s and move accordingly
        int left = 0, right=0; // for creating window
        for(right = 0;right<s.length();right++){
            char key = s.charAt(right);
            if(ani.containsKey(key)){
                have.put(key, have.getOrDefault(key, 0) + 1);

                if(have.get(key) == ani.get(key)){
                    got++;
                }
            }
            

            if(got == total){
                if(minLen > right - left + 1){
                    minLen = right - left + 1;
                    range1 = left;
                    range2 = right;
                }
            }

            while(got == total){
                char del = s.charAt(left);
                if(have.containsKey(del)){
                    have.put(del, have.get(del) - 1);

                    if(have.get(del)< ani.get(del) )
                        got--;
                }
                if(minLen > right - left + 1){
                    minLen = right - left + 1;
                    range1 = left;
                    range2 = right;
                }
                left++;

            }
        }

        // final check
        

        if(range1 == -1 || range2 == -1)
            return "";
        return s.substring(range1,range2);
    }
}
   