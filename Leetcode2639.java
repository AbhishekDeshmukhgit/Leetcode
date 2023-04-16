class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int arr[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                int temp=(grid[i][j]+"").length();
                arr[j]=Math.max(arr[j],temp);
                
            }
        }
        return arr;
    }
}