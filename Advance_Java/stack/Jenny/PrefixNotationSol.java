package stack.Jenny;

import java.util.Stack;

public class PrefixNotationSol {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String prefix = "+++2345";

        for(int i = prefix.length() - 1; i>=0 ; i--){
            char c = prefix.charAt(i);

            if(c>='0' && c<='9'){
                st.push(c);
            }else{
                char op1 = st.pop();
                char op2 = st.pop();
                int ans =  operatorHandling(c, op1, op2) + 48;
                char res = (char)ans;
                st.push(res);
                
            }
        }

        int ans = (int)st.peek() <=57 ? (int)st.peek() : (int)st.peek() - 48;

        System.out.println(ans);
    }

    static int operatorHandling(char op,char a, char b){
        int op1 = Integer.valueOf(a) - 48;
        int op2 = Integer.valueOf(b) - 48;
        if(op == '+')
            return op1 + op2;
        if(op == '-')
            return op1 - op2;
        if(op == '*')
            return op1 * op2;
        if(op == '/')
            return op1 / op2;
        
        return (int)Math.pow(op1,op2);
    }
}
