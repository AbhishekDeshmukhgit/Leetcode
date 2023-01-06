class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        //[1,1,2,3,4]3
        for(int i=0;i<costs.length;i++)
        {
            if(coins-costs[i]>=0)
            {
                coins=coins-costs[i];
                c++;
            }
            
            if(coins==0)
            {
                return c;
            }
        }
        return c;
    }
}