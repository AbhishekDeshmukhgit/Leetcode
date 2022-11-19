import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }
        int i=0;
        while(i<k)
        {
            int max=Findmax(h);
            ans[i]=max;
            h.remove(max);
            i++;
        }
        return ans;
    }
    public int Findmax(HashMap<Integer,Integer> h)
    {
        int max=0;
        int val=-1;
        for (Map.Entry<Integer, Integer> key : h.entrySet())
        {
            if(key.getValue()>max)
            {
                   val=key.getKey(); 
                max=key.getValue();
               
            }
        }
        return val;
    }
}


