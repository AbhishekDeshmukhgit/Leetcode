class Solution {
    public long coloredCells(int n) {
        if(n==0)
        {
            return 0;
        }
        long ans=1;
        long add=0;
        for(int i=1;i<=n;i++)
        {
            ans=ans+add;
            add=add+4;
        }
        return ans;
    }
}