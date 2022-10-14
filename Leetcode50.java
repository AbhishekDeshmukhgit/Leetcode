class Solution {
    public double myPow(double x, int nn) {
       long n=nn;
        if(n<0)
        {
            n=n*-1;
        }
        double ans=1.0;
        while(n>0){
        if(n%2==0)
        {
            x=(x*x);
            n=n/2;
        }
        else
        {
            ans=ans*x;
            n=n-1;
        }
        }
        if(nn<0)
        {
            return 1/ans;
        }
        return ans;
    }
}