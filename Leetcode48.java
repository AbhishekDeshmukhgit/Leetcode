class Solution {
    public void rotate(int[][] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums[i].length;j++)
            {
                int data=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=data;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            reverse(nums[i]);
        }
    }
    public void reverse(int nums[])
    {
        int i=0,j=nums.length-1;
        while(i<j)
        {
            int data=nums[i];
            nums[i]=nums[j];
            nums[j]=data;

            i++;
            j--;
        }
    }
}