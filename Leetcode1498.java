class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
         int mod=(int)1e9+7;
        int left=0,right=nums.length-1;
        int res=0;
        int power[]=new int[nums.length];
        power[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            power[i]=(power[i-1]*2)%mod;
        }
        while(left<=right)
        {
            if(nums[left]+nums[right]>target)
            {
                right--;
            }
            else{
                int n=right-left;
                res=(res+power[n])%mod;
                left++;
            }
        }
        return (int)res;
    }
}