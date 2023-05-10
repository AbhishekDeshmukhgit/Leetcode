class Solution {
    public int[][] generateMatrix(int n) {
        int m[][]=new int[n][n];
        int top=0,left=0,down=n-1,right=n-1,dir=0;
        int temp=1;
        while(top<=down && left <=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    m[top][i]=temp;
                    temp++;
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    m[i][right]=temp;
                    temp++;
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    m[down][i]=temp;
                    temp++;
                }
                down--;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    m[i][left]=temp;
                    temp++;
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return m;
    }
}