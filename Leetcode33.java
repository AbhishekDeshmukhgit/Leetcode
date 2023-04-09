class Solution {
    public int search(int[] nums, int target) {
        int pivot=pivot(nums);
        int a1=binarysearch(nums,0,pivot-1,target);
        if(a1==-1)
        {
            return binarysearch(nums,pivot,nums.length-1,target);
        }
        return a1;
    }
    public int binarysearch(int arr[],int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int pivot(int[] nums)
    {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid>0 && nums[mid]<nums[mid-1])
            {
                return mid;
            }
            if(nums[start]<=nums[mid] && nums[mid]>nums[end])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
    }
}