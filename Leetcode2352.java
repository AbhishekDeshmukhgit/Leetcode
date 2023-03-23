class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
     HashMap<String,Integer> h=new HashMap<String,Integer>();
     for(int i=0;i<grid.length;i++)
     {
         String a="";
         for(int j=0;j<grid[i].length;j++)
         {
             a=a+grid[i][j];
             a=a+'+';
         }
            h.put(a,h.getOrDefault(a,0)+1);
     }   
     for(int i=0;i<grid.length;i++)
     {
         String a="";
         for(int j=0;j<grid[i].length;j++)
         {
             a=a+grid[j][i];
             a=a+"+";
         }
         if(h.containsKey(a))
         {
             count=count+h.get(a);
         }
     }
     return count;
    }
}