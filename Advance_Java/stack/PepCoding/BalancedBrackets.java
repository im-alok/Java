// check is the brackets are in same place or not and equal no of closing and opening braqckets is there
// Problem : 2 stack and queues PEPCODING
package stack.PepCoding;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        // String str = "[(a+b)*{(c+d) * (e/f)}]";
        String str = "[(a+b)+{(c+d)*(e/f)}]";
        Stack<Character> st = new Stack();

        for (char elem : str.toCharArray()) {
            if(elem == '(' || elem == '{' || elem =='['){
                st.push(elem);
            }
            else if(elem == ')'){
                if(st.isEmpty()){
                    System.out.println("more number of closing brackets is found");
                    return;
                }
                else if(st.peek() == '(')
                    st.pop();
                else{
                    System.out.println("Bracket mismatched");
                    return;
                }
                
            }
            else if(elem == '}'){
                if(st.isEmpty()){
                    System.out.println("more number of closing brackets is found");
                    return;
                }
                else if(st.peek() == '{')
                    st.pop();
                else{
                    System.out.println("Bracket mismatched");
                    return;
                }
                
            }
            else if(elem == ']'){
                if(st.isEmpty()){
                    System.out.println("more number of closing brackets is found");
                    return;
                }
                else if(st.peek() == '[')
                    st.pop();
                else{
                    System.out.println("Bracket mismatched");
                    return;
                }
                
            }
        }

        if(!st.isEmpty()){
            System.out.println("more number of opening brackets is present");
        }
        else    System.out.println("Balanced Brackets is present");
    }
}
