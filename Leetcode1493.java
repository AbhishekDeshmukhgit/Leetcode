class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,z=0,res=0;
        while(j<nums.length)
        {
            if(nums[j]==1)
            {
                res=Math.max(res,j-i+1);
                j++;
            }
            else if(nums[j]==0 && z==0)
            {
                res=Math.max(res,j-i+1);
                j++;
                z=1;
            }
            else  if(nums[j]==0 && z!=0)
            {
                while(nums[i]!=0)
                {
                    i++;
                }
                if(nums[i]==0)
                {
                    z=0;
                    i++;
                }

            }

        }
        return res-1;
    }
}