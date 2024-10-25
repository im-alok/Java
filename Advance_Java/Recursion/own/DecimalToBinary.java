package Recursion.own;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 20;

        String ans = dtb(number);
        System.out.println(ans);
    }

    public static String dtb(int number){
        if(number == 0)
            return "";
        String ans = dtb(number/2) + number % 2;

        return ans;
    }
}
