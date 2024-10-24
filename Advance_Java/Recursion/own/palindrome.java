package Recursion.own;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "alla";

        boolean ans = palindrome(s);
        // String ans = s.substring(1, s.length() - 1);
        System.out.println(ans);
    }


    public static  boolean palindrome(String s){

        boolean ans = false;
        if(s.length()==0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length() - 1)){
            ans = palindrome(s.substring(1, s.length() - 1));
        }

        return ans;
    }
}
