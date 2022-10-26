class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length+nums2.length];
        int index=0;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
            {
                res[index]=nums1[i];
                i++;
                index++;
            }
            else if(nums2[j]<nums1[i])
            {
                res[index]=nums2[j];
                j++;
                index++;
            }
        }
        while(i<nums1.length)
        {
            res[index]=nums1[i];
            i++;
            index++;
        }
        while(j<nums2.length)
        {
            res[index]=nums2[j];
            j++;
            index++;
        }
        if (res.length % 2 != 0)
            return (double)res[res.length / 2];
 
        return (double)(res[(res.length - 1) / 2] + res[res.length / 2]) / 2.0;
    }
}