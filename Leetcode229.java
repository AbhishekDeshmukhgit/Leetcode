class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length;
        int t=n/3;
        for(Map.Entry<Integer,Integer> ele:h.entrySet())
        {
            if(ele.getValue()>t)
            {
                list.add(ele.getKey());
            }
        }
        return list;
    }
}