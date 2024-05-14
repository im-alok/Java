public class StringQ {
    public static void main(String[] args) {
        String s = "hello";
        String n = "llo";
        int ans = strStr(s,n);
        System.out.println(ans);
    }
    
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length() - needle.length();i++){
            // System.out.println(needle);
            String ans = haystack.substring(i,i + needle.length());
            if(needle.equals(ans))
                return i;
        }
        return -1;
    }
}
