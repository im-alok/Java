package stack.PepCoding;
// get the maximum among the given window size

import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int [] arr = {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int k = 4; //window size

        //approach:
        // get the nge because if nge of that element lies within window then it will maximum else that number is maximum
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nge[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for(int i = arr.length-2 ;i>=0;i--){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            if(st.isEmpty())
                nge[i]= arr.length;
            else nge[i] = st.peek();

            st.push(i);
        }


        int j=0;

        for(int i=0; i<arr.length - k; i++){
            if(j<i)
                j = i;
            while (nge[j] < i + k) 
                j = nge[j];
            System.out.print(arr[j] + " ");
        }
    }
}
