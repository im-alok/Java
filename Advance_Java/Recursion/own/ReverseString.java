package Recursion.own;

public class ReverseString {
    public static void main(String[] args) {
        String name = "the simple engineer";
        String rev = reverseString(name);
        System.out.println(rev);
    }

    public static String reverseString(String Name){
        if(Name.length() == 0)
            return "";
        String a=reverseString(Name.substring(1,Name.length()));
        String ans = a + Name.charAt(0);

        return ans;

    }
}
