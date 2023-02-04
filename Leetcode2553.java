class Solution {
    ArrayList<Integer> list=new ArrayList<Integer>();
    public int[] separateDigits(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            Separate(nums[i]);
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void Separate(int n){
        String str=n+"";
        for(int i=0;i<str.length();i++)
        {
            list.add(Integer.parseInt(str.charAt(i)+""));
        }
    }
    
}