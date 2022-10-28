class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> lst  = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int low=i+1;
            int high=nums.length-1;
            while(low<high)
            {
                int res=nums[i]+nums[low]+nums[high];
                if(res==0)
                {
                    lst.add(Arrays.asList(nums[i],nums[low],nums[high]));
                }
                if(res<0)
                {
                    low++;
                }
                else{
                    high--;
                }
            }
        }
    
         return new ArrayList<>(lst);
    }
}












