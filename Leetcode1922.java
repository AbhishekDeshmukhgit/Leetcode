class Solution {
    public long mod = 1000000007;
    public int countGoodNumbers(long n) {
         long odd=n/2;
        long even=n/2+n%2;
        return (int)(power(5,even)*power(4,odd)%mod);
    }
    long power(long x,long n)
    {
        if(n==0)
        {
            return 1;
        }
        long ans=power(x,n/2);
        if(n%2==0)
        {
            return (ans*ans)%mod;
        }
        else{
            return (x*ans*ans)%mod;
        }
    }
}