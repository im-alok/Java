public class char_to_int {
    public static void main(String[] args) {
        String s = "alok ranjan";
        char[] str = new char[s.length()];
        str = s.toCharArray();
        for (int i = 0; i < str.length; i++)
            System.out.println((int) str[i]);
    }

}
