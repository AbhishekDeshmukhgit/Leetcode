class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

//Using PriorityQueue
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            q.offer(nums[i]);
        }
        for(int i=1;i<k;i++)
        {
            q.poll();
        }
        return q.peek();
    }
}