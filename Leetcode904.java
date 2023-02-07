class Solution {
    public int totalFruit(int[] fruits) {
        int count[]=new int[fruits.length];
        int typect=0;
        int max=0;
        int currmax=0;
        int start=0;
        for(int i=0;i<fruits.length;i++)
        {
            if(count[fruits[i]]==0)
            {
                typect++;
            }
            count[fruits[i]]++;
            currmax++;
            while(typect>=3 && start<fruits.length)
            {
                count[fruits[start]]--;
                if(count[fruits[start]]==0)
                {
                    typect--;
                }
                start++;
                currmax--;
            }
            max=Math.max(currmax,max);
        }
        return max;
    }
}