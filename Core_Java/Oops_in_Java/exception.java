public class exception {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Occurs");

        }
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
    }
}