package stack.PepCoding;

import java.util.Stack;

// a person is called celebrity if he know nobody but everyone knows him
// you have given 2-d array shows each person knows each other

public class CelebrityProblem {
    public static void main(String[] args) {
        int [][] arr = {{0,1,1,1,1}, {1,0,0,1,0},{1,0,0,1,0}, {0,0,0,0,0,}, {0,1,0,1,0}};

        Stack<Integer> st = new Stack<>();

        //adding the number of people
        for(int i=0;i<arr.length;i++)
            st.push(i);
        
        while (st.size()>=2) {
            int i = st.pop();
            int j = st.pop();
            //if i knows j -> i is not a celebrity
            if(arr[i][j] == 1)
                st.push(j);
            // if i does not knows j -> j is not a celebrity
            else st.push(i);            
        }

        int pot = st.pop();

        for(int i=0;i<arr.length;i++){
            if(i!=pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("No celebrity found");
                    return;
                }
            }
        }
        System.out.println(pot + " is the celebrity");

    }
}
