class Solution {
    public int averageValue(int[] nums) {
        int n=0,res=0;
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                res=res+nums[i];
                n++;
                flag=1;
            }
        }
        if(flag==0)
        {
            return 0;
        }
        else{
        return Math.abs(res/n);    
        }
        
    }
}