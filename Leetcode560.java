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

//Efficient Solution
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int count=0;
        int currsum=0;
        h.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            currsum=currsum+nums[i];
             if(h.containsKey(currsum-k))
            {
                count=count+h.get(currsum-k);
            }
            h.put(currsum,h.getOrDefault(currsum,0)+1);

        }
        return count;
    }
}