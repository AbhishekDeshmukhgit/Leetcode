class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2!=0)
           {
               continue;
           }
           int temp=0,j;
            for( j=i;j<nums.length-1;j++)
            {
                if(nums[j]%2==nums[j+1]%2)
                {
                    break;
                }
                if(nums[j]>threshold)
                {
                    break;
                }

                temp=j-i+1;

            }
            if(nums[j]<=threshold)
            {
                temp++;
            }
            res=Math.max(res,temp);
        }
        return res;
    }
}