class Solution {
    public long putMarbles(int[] arr, int k) {
        if(arr.length==k)
        {
            return 0;
        }
        long c2=arr[0]+arr[arr.length-1];
        
        long c1=arr[0]+arr[arr.length-1];
        int nums[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            nums[i-1]=arr[i]+arr[i-1];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<k-1;i++)
        {
            c1=c1+nums[i];
        }
        int i=0,j=nums.length-1;
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(nums));
        for(int z=0;z<k-1;z++)
        {
            c2=c2+nums[z];
        }
        return c2-c1;

    }

}