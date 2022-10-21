class Solution {
    public int[] rearrangeArray(int[] nums) {
        int res[]=new int[nums.length];
        int mid=nums.length/2;
        int pos[]=new int[mid];
        int neg[]=new int[mid];
        int p=0,n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                pos[p]=nums[i];
                p++;
            }
            else{
                neg[n]=nums[i];
                n++;
            }
        }
        p=0;
        n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                res[i]=pos[p];
                p++;
            }
            else{
                res[i]=neg[n];
                n++;
            }
        }
        return res;
    }
}