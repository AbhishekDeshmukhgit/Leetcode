class Solution {
    public int largestAltitude(int[] gain) {
       int res[]=new int[gain.length+1];
       res[0]=0;
       for(int i=1;i<res.length;i++)
       {
           res[i]=gain[i-1]+res[i-1];
       } 
       int m=0;
       for(int i=0;i<res.length;i++)
       {
           m=Math.max(m,res[i]);
       }
       return m;
    }
}