class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=0,high=100000000000000L,ans=high;
        while(low<high)
        {
            long mid=low + (high - low) / 2;
            long cnt=0;
            for(int i=0;i<time.length;i++)
            {
                cnt=cnt+(mid/time[i]);
            }
            if(cnt>=totalTrips)
            {
                ans=Math.min(ans,mid);
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}