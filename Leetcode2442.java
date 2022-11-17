class Solution {
    public int countDistinctIntegers(int[] nums) {
        int rev[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            rev[i]=reverseDigits(nums[i]);
        }
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
            h.add(rev[i]);
        }
    
        return h.size();
    }
    public int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}