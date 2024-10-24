package Recursion;

import java.util.*;

public class Stairs{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<String> ans = solution(n);

        System.out.print(ans);

    }

    static ArrayList<String> solution(int n){

        if(n == 0){
            ArrayList<String> st = new ArrayList<>();
            st.add("");
            return st;
        }
        else if(n < 0){
            ArrayList<String> st = new ArrayList<>();
            return st;
        }

        ArrayList<String> path1 = solution(n-1);
        ArrayList<String> path2 = solution(n-2);
        ArrayList<String> path3 = solution(n-3);
        ArrayList<String> answer = new ArrayList<>();

        for(String a : path1){
            answer.add(1 + a);
        }

        for(String a : path2){
            answer.add(2 + a);
        }

        for(String a : path3){
            answer.add(3 + a);
        }

        return answer;
    }
}