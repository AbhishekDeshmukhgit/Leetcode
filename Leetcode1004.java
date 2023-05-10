class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,res=0;
        while(i<nums.length && j<nums.length)
        {
            if(nums[j]==1)
            {
                res=Math.max(res,j-i+1);
                j++;
            }
            else if(nums[j]==0){
                if(k>0)
                {
                    k--;
                    res=Math.max(res,j-i+1);
                    j++;
                }
                else if(k==0){
                    while(k==0)
                    {
                        if(nums[i]==0)
                        {
                            k++;
                            i++;
                        }
                        else{
                            i++;
                        }
                    }
                }
            }
        }
        return res;

    }
}