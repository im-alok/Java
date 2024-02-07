package Recursion;

public class recursion {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        int i = 1;
        System.out.println(i);
        message1(++i);
    }
    static void message1(int i){
        System.out.println(i);
        message2(++i);
        
    }
    static void message2(int i){
        System.out.println(i);
        message3(++i);
        
    }
    static void message3(int i){
        System.out.println(i);
        System.out.println("Over");
    }
}
