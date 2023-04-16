class Solution {
    public long[] findPrefixScore(int[] nums) {
        int con[]=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            con[i]=nums[i]+max;
        }
        long ans[]=new long[nums.length];
        ans[0]=con[0];
        for(int i=1;i<con.length;i++)
        {
            ans[i]=con[i]+ans[i-1];
        }
        return ans;
    }
}