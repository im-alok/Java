// write a code in java to check whether the duplicates or not need bracket is present in the string
// example:
    // string str = '((a+b) + (c+d)) - does not contains duplicate brackets'
    // string str = (a+b) + ((a+b)) - true contains duplicate brackets;


package stack.PepCoding;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String s = "((a+b)+((c+d)))";

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);

            if(key == ')'){
                if(st.peek() == '('){
                    System.out.println("true");
                    return;
                }
                else{
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else st.push(key);
        }
    
        System.out.println("false: as no duplicate brackets is present");
    }
}
