package stack.Jenny;

import java.util.Stack;

public class Infix_2_postfix {
    public static void main(String[] args) {
        String infix = "K+L-M*N+(O^P)*W/U/V*T+Q";
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<infix.length();i++){
            char c = infix.charAt(i);

            //if there is a operand directly add it to the result
            if(c >= 'a' && c<='z' || c >='A' && c <='Z' || c>='0' && c<='9'){
                result.append(c);
            }

            else if(c == '(')
                st.push(c);
            else if(c == ')'){
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();
            }

            else{
                while(!st.isEmpty() && ((prec(c) < prec(st.peek())) || (prec(c) == prec(st.peek()) && assoc(c) == 'L')))
                    result.append(st.pop());

            st.push(c);
            } 
        }
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        System.out.println(result);
    }

    static int prec(char c) {
        if (c == '^')
            return 3;
        if (c == '*' || c == '/')
            return 2;
        if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    static char assoc(char c) {
        if (c == '^')
            return 'R';
        return 'L';
    }
}
