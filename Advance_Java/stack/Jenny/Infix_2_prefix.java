package stack.Jenny;

import java.util.Stack;

public class Infix_2_prefix {
    public static void main(String[] args) {
        String infix = "A^B^C^D";
        StringBuilder rinfix = new StringBuilder(infix);
        rinfix.reverse();

        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < rinfix.length(); i++) {
            char c = rinfix.charAt(i);

            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')
                result.append(c);
            else if (c == ')')
                st.push(c);

            // if opening parenthesis is encountered
            else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    result.append(st.pop());
                }
                st.pop();
            }

            // if operator is encountered
            else {
                while (!st.isEmpty() && (prec(c) < prec(st.peek()) || (prec(c) == prec(st.peek())) && assoc(c) == 'R')) {
                    result.append(st.pop());
                }
                st.push(c);
            }

        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        result.reverse();
        System.out.println(result.toString());
    }

    private static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;

        return -1;
    }

    private static char assoc(char c) {
        if (c == '^')
            return 'R';
        return 'L';
    }
}
