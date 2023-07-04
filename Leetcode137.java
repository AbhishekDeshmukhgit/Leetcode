class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> ele:h.entrySet())
        {
            if(ele.getValue()==1)
            {
                return ele.getKey();
            }
        }
        return -1;
    }
}