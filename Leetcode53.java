class Solution {
    public int maxSubArray(int[] nums) {
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