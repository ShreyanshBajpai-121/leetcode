import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);

            if (st.isEmpty()) {
                st.push(str);
            } else if (str == '(' || str == '{' || str == '[') {
                st.push(str);
            } else if (str == ')' || str == '}' || str == ']') {
                if (sameStyle(str, st.peek())) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty(); 
    }
    private boolean sameStyle(char close, char open) {
        return (close == ')' && open == '(') ||
               (close == '}' && open == '{') ||
               (close == ']' && open == '[');
    }
}
