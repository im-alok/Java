package Gfg;

import java.util.Stack;

public class ValidSubstring {
    public static void main(String[] args) {
        String s = ")(()((((()))))))()()(()(()(())()()()))())(";
        int ans = findMaxLen(s);
        System.out.println(ans);
    }
    static int findMaxLen(String S) {
        // code here
        Stack<Character> st = new Stack<>();
        int count = 0;
        int max = 0;
        for(int i=0;i<S.length();i++){
            char key = S.charAt(i);
            if(key == '(')
                st.push(key);
            if(key == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    count+=2;
                    st.pop();
                }
                if(st.isEmpty()){
                    if(max < count)
                        max = count;
                    count = 0;
                }
                
            }
        }
        return max;
    }
}
