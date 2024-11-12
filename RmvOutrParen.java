import java.util.Stack;

public class RmvOutrParen {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int open = 1, close=0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)=='('){
                open++;
                st.push(s.charAt(i));
            } else{
                close++;
                st.push(s.charAt(i));
            }
            if(open==close) {
                st.pop();
                close = 0;
                open = 1;
                i++;
            }
        }
        String ans= "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        return ans;
    }
}
