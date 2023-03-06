class Solution {
    public int passThePillow(int n, int time) {
        if(n==1)
        {
            return 1;
        }
        int p=1;
        int flag=0;
        for(int i=0;i<time;i++)
        {
            if(flag==0)
            {
                p++;
            }
            if(flag==1)
            {
                p--;
            }
            if(p==1)
            {
                flag=0;
            }
            if(p==n)
            {
                flag=1;
            }

        }
        return p;
    }
}