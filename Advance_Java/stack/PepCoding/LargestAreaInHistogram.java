package stack.PepCoding;

import java.util.Stack;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        int [] arr = {6,2,5,4,5,1,6};
        int [] rb = new int[arr.length]; //nse from rigth
        int [] lb = new int[arr.length]; //nse from left

        //next smaller element to right
        Stack<Integer> st = new Stack<>();
        rb[arr.length - 1] = arr.length;
        st.push(arr.length - 1);
        for(int i = arr.length - 2 ;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                rb[i] = arr.length;
            else
                rb[i] = st.peek();
            st.push(i);
        }

        st.clear();

        //nse to left
        //next smaller element to right
        lb[0] = -1;
        st.push(0);
        for(int i =1 ;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                lb[i] = -1;
            else
                lb[i] = st.peek();
            st.push(i);
        }

        //area 
        int maxArea = 0;
        for(int i=0;i<rb.length;i++){
            int window = rb[i] - lb[i] - 1;
            int area = arr[i] * window;
            if(area > maxArea)
                maxArea = area;
        }

        System.out.println(maxArea);
    }
}
