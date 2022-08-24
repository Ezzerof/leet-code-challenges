package Easy.string;

import java.util.Stack;

public class ValidParenthenses {

    static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();

            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(c);
            }

        }

        return stack.isEmpty();


    }

    public static void main(String[] args) {

        System.out.println(isValid("(){}[]"));
    }

}
