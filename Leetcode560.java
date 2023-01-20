//Naive Solution
class Solution {
    public int subarraySum(int[] nums, int k1) {
        int ans = 0;
        for(int i=0;i<nums.length;i++) {
            int sum=0;
            for(int j=i;j<nums.length;j++) {
                sum+=nums[j];
                if(sum==k1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}