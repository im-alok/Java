package HackerRank;

public class Power{
    public static void main(String[] args) {
        int a =2;
        int b=5;
        int ans = power(2, 5);
        System.out.println(ans);
    }

    static int power(int a, int b){
        

        int pow = 1;

        for(int i =1;i<=b;i++)
            pow = pow *a;
        return pow;
    }
}