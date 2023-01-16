class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> res=new ArrayList<>();
        int index=0;
        int low=newInterval[0];
        int high=newInterval[1];
        while(index<intervals.length && intervals[index][1]<newInterval[0])
        {
            res.add(intervals[index]);
            index++;
        }
        while(index<intervals.length && intervals[index][0]<=newInterval[1])
        {
            low=Math.min(low,intervals[index][0]);
            high=Math.max(high,intervals[index][1]);
            index++;
        }
        res.add(new int[] {low,high});
        while(index<intervals.length)
        {
            res.add(intervals[index]);
            index++;
        }
        return res.toArray(new int[res.size()][]);
    }
}