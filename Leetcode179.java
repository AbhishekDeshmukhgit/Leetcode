class Solution {
    public String largestNumber(int[] nums) {
        String str[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(String s1,String s2)->(s2+s1).compareTo(s1+s2));

        StringBuilder sb=new StringBuilder();
        if(str[0].charAt(0)=='0')
        {
            return "0";
        }
        for(String s:str)
        {
            sb.append(s);
        }
        return sb.toString();
    }
}