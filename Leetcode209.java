class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;                                                
        int ans=Integer.MAX_VALUE,sum=0;
        while(i<nums.length && j<nums.length)
        {
            sum=sum+nums[j];
            if(sum>=target)
            {
                ans=Math.min(ans,j-i+1);
                while(sum>=target)
                {
                    sum=sum-nums[i];
                    i++;
                    if(sum>=target)
                    {
                        ans=Math.min(ans,j-i+1);
                    }
                    
                }
                j++;
            }
            else {
                j++;
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            return 0;
        }
        return ans;

    }
}