class Solution {
    public int[] applyOperations(int[] nums) {
       int res[]=new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        int i=0;
        for(int j=list.size();j<nums.length && i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                res[j]=nums[i];
            }
            i++;
        }
        return res;
    }
}