class Solution {
    public int maxDepth(String s) {
        int open=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
                ans=Math.max(open,ans);
            }
            else if(s.charAt(i)==')')
            {
                open--;
                ans=Math.max(open,ans);
            }
        }
        if(open==0)
        {
            return ans;
        }
        return -1;

    }
}