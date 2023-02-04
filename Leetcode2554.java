class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<banned.length;i++)
        {
            h.add(banned[i]);
        }
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(!h.contains(i))
            {
                if(sum+i>maxSum)
                {
                    return count;
                }
                else{
                    count++;
                    sum=sum+i;
                }
            }
        }
        return count;
    }
}
