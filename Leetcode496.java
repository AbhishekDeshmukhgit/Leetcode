class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        stack.push(nums2[nums2.length-1]);
        HashMap<Integer,Integer> h=new HashMap<>();
        int res[]=new int[nums2.length];
        res[0]=-1;
        int index=1;
        for(int i=nums2.length-2;i>=0;i--)
        {
            while(stack.isEmpty()==false && nums2[i]>=stack.peek())
            {
                stack.pop();
            }
            res[index]=stack.isEmpty()?-1:stack.peek();
            index++;
            stack.push(nums2[i]);
        }
        int j=res.length-1;
        for(int i=0;i<nums2.length;i++)
        {
            h.put(nums2[i],res[j]);
            j--;
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=h.getOrDefault(nums1[i],-1);
        }
        return ans;

    }
}