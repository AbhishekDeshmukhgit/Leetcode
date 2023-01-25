class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int row[]=new int[r];
        int col[]=new int[c];
        for(int i=0;i<row.length;i++)
        {
            row[i]=-1;
        }
        for(int i=0;i<col.length;i++)
        {
            col[i]=-1;
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {                  
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(row[i]==0 || col[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}