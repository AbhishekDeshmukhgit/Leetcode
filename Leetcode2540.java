//Naive Approach
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int res;
        int min=Integer.MAX_VALUE;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            h.add(nums1[i]);
            }
        for(int i=0;i<nums2.length;i++)
        {
            if(h.contains(nums2[i]))
            {
                res=nums2[i];
                min=Math.min(res,min);
            }
        }
        if(min!=Integer.MAX_VALUE)
        {
            return min;
        }
        return -1;
    }
}

//Optimised Approach
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                return nums1[i];
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}