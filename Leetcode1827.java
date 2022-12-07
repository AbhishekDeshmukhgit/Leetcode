class Solution {
    public int minOperations(int[] nums) {
       int count=0;
        int i=0;
        int j=i+1;
        while(i<nums.length-1)
        {
            if(nums[i]<nums[j])
            {
                i++;
                j++;
            }
            else if(nums[i]>nums[j])
            {
                count=count+(nums[i]-nums[j]+1);
                nums[j]=nums[i]-nums[j]+nums[j]+1;
                i++;
                j++;
            }
            else{
                nums[j]=nums[j]+1;
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
}