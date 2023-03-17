class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
        }
        int i=0;
        while(k>0)
        {
            
            i++;
            if(!h.contains(i))
            {
                k--;
            }
        }
        return i;
    }
}