class Solution {
    public int subarrayLCM(int[] nums, int k) {
       int count=0;
        for(int i=0;i<nums.length;i++)
        {
           int lcm=1;
            for(int j=i;j<nums.length;j++)
            {
                lcm=LCM(lcm,nums[j]);
                if(lcm==k)
                {
                    count++;
                }
                else if(lcm>k)
                {
                    break;
                }
                
            }
        }
        return count;
    }
    public int GCD(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return GCD(b,a%b);
    }
    public int LCM(int a,int b)
    {
        return (a*b)/GCD(a,b);
    }
}