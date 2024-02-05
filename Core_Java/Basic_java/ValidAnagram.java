
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        int i, j;
        StringBuilder sb = new StringBuilder(t);
        int count = t.length();
        if (t.length() != s.length())
            return false;
        for (i = 0; i < s.length(); i++) {
            for (j = 0; j < sb.length(); j++) {
                if (s.charAt(i) == sb.charAt(j)) {
                    count--;
                    sb.deleteCharAt(j);
                    break;
                }
            }
            if (count == 0)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);

    }
}