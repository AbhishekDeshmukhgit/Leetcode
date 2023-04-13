class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        Stack<Integer> st=new Stack<Integer>();
        while(i<pushed.length)
        {
            st.push(pushed[i]);
            while(!st.empty() && j<popped.length && st.peek()==popped[j])
            {
                st.pop();
                j++;
            }
            i++;
        }
        return st.empty();
    }
}