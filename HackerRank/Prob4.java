package HackerRank;

import java.io.*;
import java.util.*;

public class Prob4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
            Scanner sc=new Scanner(System.in);
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf( "%-15s%03d\n", s1, x);
                //Complete this line
            }
            System.out.println("================================");
    }
}