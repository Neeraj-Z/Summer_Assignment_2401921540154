import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {

                if(stack.empty()) {
                    return false;
                }

                char open = stack.pop();

                if(ch == ')') {
                    if(open != '(') {
                        return false;
                    }
                }
                else if(ch == '}') {
                    if(open != '{') {
                        return false;
                    }
                }
                else if(ch == ']') {
                    if(open != '[') {
                        return false;
                    }
                }
            }
        }

        if(stack.empty()) {
            return true;
        }

        return false;
    }
}