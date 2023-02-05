class Solution {
    public long pickGifts(int[] gifts, int k) {
        int m=0;
        for(int i=0;i<k;i++)
        {
            m=maximum(gifts);
            gifts[m]=(int)Math.sqrt(gifts[m]);
        }
        long sum=0;
        for(int i=0;i<gifts.length;i++)
        {
            sum+=gifts[i];
        }
        return sum;
    }
    public int maximum(int arr[])
    {
        int index=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}