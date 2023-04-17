class Solution {
    public int maxDivScore(int[] nums, int[] div) {
        int ans=-1,score=-1;
        for(int i=0;i<div.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%div[i]==0)
                {
                    count++;
                }
            }
            if(count>score)
            {
                score=count;
                ans=div[i];
            }
            else if(count==score)
            {
                ans=Math.min(ans,div[i]);
            }
        }
        return ans;
    }
}