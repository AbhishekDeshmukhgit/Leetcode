import java.util.Stack;

public class Leetcode20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
           char ch=s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else if(st.empty())
            {
                return false;
            }
            else if(ch==')'&& st.pop()!='(')
            {
                return false;
            }
            else if(ch==']'&& st.pop()!='[')
            {
                return false;
            }
            else if(ch=='}'&& st.pop()!='{')
            {
                return false;
            }
           
        }
        return st.empty();
    }
}
