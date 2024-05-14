package Hashmap;

import java.util.HashMap;

public class BasicHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Alok", 55);
        System.out.println(map.get("Alok"));
        map.put("Alok", 66);
        System.out.println(map.get("Alok"));
        System.out.println(map.containsKey("pawan"));

    }
}
