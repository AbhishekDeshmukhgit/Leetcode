class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
         int k=Kadane(nums);
        for(int i=0;i<nums.length;i++)
        {
            totalsum=totalsum+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*-1;
        }
        int circular=totalsum+Kadane(nums);
        if(circular==0)
            return k;
        return Math.max(circular,k);
        
    }
    public int Kadane(int[] nums)
    {
        int sum=0;
        int res=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            
            res=Math.max(sum,res);
            if(sum<0)
            {
                sum=0;
            }
        }
        return res;
    }
}

