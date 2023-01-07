class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
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
//Optimised Approach
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int i=0;i<costs.length;i++)
        {
            if(costs[i]<=coins)
            {
                coins=coins-costs[i];
                c++;
            }
        }
        return c;
    }
}