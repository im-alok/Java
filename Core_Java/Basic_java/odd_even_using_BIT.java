public class odd_even_using_BIT {
    public static void main(String[] args) {
        // Checking whether the number is odd or even
        int a = 11;
        if ((a & 1) == 0)
            System.out.println("Even Number");
        if ((a & 1) == 1)
            System.out.println("Odd Number");
    }

}
