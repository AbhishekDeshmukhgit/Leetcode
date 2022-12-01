class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
          int avg=0;  
           avg=nums[i]+nums[j];
          h.add(avg);
            i++;
            j--;
        }
        return h.size();
    }
}
