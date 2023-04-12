class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int res=0;
        int temp=0;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
            {
                temp+=1;
                res+=temp;
            }
            else{
                temp=0;
            }
        }
        return res;
    }
}