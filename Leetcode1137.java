class Solution {
    public int tribonacci(int n) {
        if(n<2)
        {
            return n;
        }
        int a=0,b=1,c=1,d;
        while(n >2)
        {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            n--;
        }
        return c;
    }
}


//Another Approach
class Solution {
    public int tribonacci(int n) {
        int f[]=new int[38];
        f[0]=0;
        f[1]=f[2]=1;
        for(int i=0;i<n-2;i++)
        {
            f[i+3] = f[i] + f[i+1] + f[i+2];
        }
        return f[n];
    }
}