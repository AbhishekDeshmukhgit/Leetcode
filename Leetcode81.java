class Solution {
    public boolean search(int[] nums, int target) {
       int  flow=0;
       int s_high=nums.length-1;
        int s_low=0;
        int fhigh=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                s_low=i;
                fhigh=i-1;
            }
        }
        if(binarySearch(nums,flow,fhigh,target) || binarySearch(nums,s_low,s_high,target))
        {
            return true;
        }
        return false;
    }
    public boolean binarySearch(int[] nums,int low,int high,int target)
        {
            while(low<=high)
            {
                int mid=(low+high)/2;                      
                if(nums[mid]==target)
                {
                    return true;
                }
                else if(nums[mid]>target)
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return false;
        }
}