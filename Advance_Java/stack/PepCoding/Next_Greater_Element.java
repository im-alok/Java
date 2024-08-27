package stack.PepCoding;

import java.util.*;
public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        int temp = ans.length - 1;

        for(int i=arr.length - 1;i >=0;i--){
            while(!st.isEmpty() && st.peek() < arr[i])
                st.pop();
            if(st.isEmpty())
                ans[temp] = -1;
            else ans[temp] = st.peek();
            st.push(arr[i]);
            temp--;
        }
        for(int elem : ans)
            System.out.print(elem + " ");
        System.out.println();
    }
}
