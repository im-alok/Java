public class test {
    public static void main(String[] args) {
        int a = 1234;

        String num = String.valueOf(a);


        for(int i=0;i<num.length(); i++ ){
            System.out.println(Integer.valueOf(num.charAt(i) - 48));
        }
        
    }
}
