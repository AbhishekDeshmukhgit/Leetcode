https://leetcode.com/problems/longest-consecutive-sequence/

//Using Hashing
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


//Using Sorting
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int res=1;
        int max=1;
        Arrays.sort(nums);
        for(int i=1;i< nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            }
            else if(nums[i]==nums[i-1]+1)
            {
                max++;
            }
            else{
               max=1;
            }
             res=Math.max(res,max);
        }
        return res;
    }
}