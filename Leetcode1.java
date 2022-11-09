class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
       int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                ans[0]=h.get(nums[i]);
                ans[1]=i;
                return ans;
            }
            h.put(target-nums[i],i);
        }
        return ans;
    }
}