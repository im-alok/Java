public class counting_sort {
    public static void main(String[] args) {
        int k = 0;
        String arr = "uwvlyhdrxbvyhygmcaszlp";
        char[] str = new char[arr.length()];
        str = arr.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < count.length; i++)
            count[i] = 0;

        for (int i = 0; i < str.length; i++) {
            count[122 - (int) str[i]] = count[122 - (int) str[i]] + 1;
        }

        for (int i = count.length - 1; i >= 0; i--) {
            int j = count[i];
            while (j > 0) {
                str[k] = (char) (122 - i);
                k++;
                j--;
            }
        }
        String ans = new String(str);
        System.out.println(ans);
    }

}
