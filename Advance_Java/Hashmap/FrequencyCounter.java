package Hashmap;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String S = "abcdabcdabshsjdjhaahjsajfbcooiojadsoabd";
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<S.length();i++){
            hm.put(S.charAt(i),hm.getOrDefault(S.charAt(i),0) + 1);
        }
        System.out.println(hm);
        
    }
}
