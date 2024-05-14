package String;

public class RotatedBy2olaces {
    public static void main(String[] args) {
        System.out.println(isRotated("ayush", "shayu"));
    }

    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length() != str2.length()) return false;
        
        String a = str1.substring(0,2);
        String b = str1.substring(str1.length() - 2,str1.length());
        System.out.println(b);
        
        String check1 = str1.substring(2,str1.length()) + a;
        
        if(check1.equals(str2))
            return true;
        
        String check2 = b + str1.substring(0,str1.length() - 2);
        if(check2.equals(str2))
            return true;
        
        
        return false;
    }
}
