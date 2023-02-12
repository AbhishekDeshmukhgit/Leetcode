class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans=0;
        ArrayDeque<Integer> a=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++)
        {
            a.offerLast(nums[i]);
        }
        int i=0;
        while(a.size()>0)
        {
            if(a.size()>1)
            {
                String str=Integer.toString(a.pollFirst())+Integer.toString(a.pollLast());
                ans=ans+Long.parseLong(str);
                
            }else{
                ans=ans+a.pollFirst();
            }
        }
        return ans;
    }
}