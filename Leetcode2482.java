class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=0;
        
        int orows[]=new int[grid.length];
        int zrows[]=new int[grid.length];
       
        
        for(int i=0;i<grid.length;i++)
        {
            n=grid[i].length;
            break;
        }
        
         int ocol[]=new int[n];
        int zcol[]=new int[n];
        int diff[][]=new int[grid.length][n];
        for(int i=0;i<grid.length;i++)
        {
            orows[i]=0;
            zrows[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            ocol[i]=0;
            zcol[i]=0;
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==0)
                {
                    zrows[i]=zrows[i]+1;
                    zcol[j]=zcol[j]+1;
                }
                else{
                    
                    orows[i]=orows[i]+1;
                    ocol[j]=ocol[j]+1;
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                    diff[i][j]=orows[i]+ocol[j]-zrows[i]-zcol[j];
            }
        }
        return diff;
    }
}