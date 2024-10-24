package InputOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StringBuilder a1 = new StringBuilder();
            
        while(in.hasNext()){
            a1.append(in.nextLine());
        }

        String[] arr = a1.split(',');

        for(String elem:arr)
            System.out.print(elem + " ");

        

        System.out.println(a1);
    }
}
