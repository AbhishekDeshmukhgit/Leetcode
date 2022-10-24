class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
      for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return gcd(max,min);
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}