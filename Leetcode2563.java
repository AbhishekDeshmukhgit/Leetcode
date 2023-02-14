class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLess(nums,upper)-countLess(nums,lower-1);
    }
    public long countLess(int nums[],int val)
    {
        int i=0,j=nums.length-1;
        long output=0;
        while(i<j)
        {
            if(nums[i]+nums[j]>val)
            {
                j--;
            }
            else{
                output=output+j-i;
                i++;
            }
        }
        return output;

    }
}