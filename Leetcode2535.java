class Solution {
    public int differenceOfSum(int[] nums) {
        int elsum=0;
        int digSum=0;
        for(int i=0;i<nums.length;i++)
        {
            elsum=elsum+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            digSum=digSum+digitSum(nums[i]);
        }
        return Math.abs(elsum-digSum);
    }
    public int digitSum(int n)
    {
        int digit=0;
        int sum=0;
        while(n>0)
        {
            digit=n%10;
            n=n/10;
            sum=sum+digit;
        }
        return sum;
    }
}