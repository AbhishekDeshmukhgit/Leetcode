class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res=0;
        int m=0;
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<grid[0].length;i++)
        {
            m=0;
            for(int j=0;j<grid.length;j++)
            {
                
            m=Math.max(m,grid[j][i]);
            
            }
            res=res+m;
        }
        return res;
    }
}