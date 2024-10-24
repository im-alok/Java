import java.util.*;

class StockSpan{
	public static void main(String[] args){
		int[] arr = {10,20,30,25,28,5,10,25,40,20,10,12,13,25,2};
		int ans [] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		int temp=0;
		for(int i=0;i<arr.length;i++){
			while(!st.isEmpty() && arr[st.peek()] < arr[i]){
				st.pop();
			}
			if(st.isEmpty()){
				ans[temp] = i + 1;
			}
			else
				ans[temp] = i - st.peek();
			temp++;
			st.push(i);
		}
		
		for(int elem:ans)
			System.out.print(elem + " ");
	}
}
