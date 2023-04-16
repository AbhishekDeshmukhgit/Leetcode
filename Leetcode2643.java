class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row=0;
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            int temp=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    temp++;
                }
            }
            if(temp>count)
            {
                row=i;
                count=temp;
            }
        }
        int ans[]=new int[2];
        ans[0]=row;
        ans[1]=count;
        return ans;
    }
}