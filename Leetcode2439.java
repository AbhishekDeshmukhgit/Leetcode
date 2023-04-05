class Solution {
    public int minimizeArrayValue(int[] nums) {
        long res=nums[0],total=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            total=total+nums[i];
            long temp=(int)Math.ceil(Double.valueOf(total)/Double.valueOf(i+1));
            res=Math.max(res,temp);
        }
        return (int)res;
    }
}