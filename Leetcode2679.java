class Solution {
    public int matrixSum(int[][] nums) {
        int score=0;
        for(int i=0;i<nums.length;i++)
        {
            Arrays.sort(nums[i]);

        }
        int j=nums[0].length-1;
        while(j>=0)
        {
            int max=0,i=0;        
            while(i<nums.length)
            {
                max=Math.max(max,nums[i][j]);
                i++;
            }
            score=score+max;
            j--;
        }
        
        
     return score;   
    }
}