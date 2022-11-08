https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        
         int res=0,curr=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!h.contains(nums[i]-1))
            {
            curr=1;
            while(h.contains(nums[i]+curr))
            {
                curr++;
            }
            res=Math.max(res,curr);   
            }
        }
               return res;
    }
}