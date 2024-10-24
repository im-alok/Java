package Gfg;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        String sentence = "This is alpha 5057 and 97";
        
        long res = -1;
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length; i++){
            try{
                res = Integer.parseInt(arr[i]);
                String str = arr[i];
                int count = 0;
                for(int j=0;j<str.length();j++){
                    char c = str.charAt(j);
                    if(c == '9'){
                        res = -1;
                        break;
                    }else
                        count++;
                }
                
                if(count == str.length()){
                    System.out.println(res);
                    return;
                }
                
            }
            catch(Exception e){
                res = -1; 
            }
        }
        
        System.out.println(res);
    }
}