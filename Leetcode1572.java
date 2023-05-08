class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,m=mat.length;
        for(int i=0;i<mat.length;i++)
        {
            sum=sum+mat[i][i];
            sum=sum+mat[i][m-i-1];
        }
        if(m%2==0)
        {
            return sum;
        }
        else{
            return sum-mat[m/2][m/2];
        }
    }
}