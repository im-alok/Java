public class bit_manipulation4 {
    public static void main(String[] args) {
        // How many bits are required to change if u want to convert a to b

        int a = 22;
        int b = 27;
        int count = 0;
        int num = a ^ b;
        while (num > 0) {
            num = (num & (num - 1));
            count++;
        }
        System.out.println(count);
    }

}
