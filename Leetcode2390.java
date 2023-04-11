class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                st.pop();
            }
            else{
                st.push(s.charAt(i));   //lecoe
            }

        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0)
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
}