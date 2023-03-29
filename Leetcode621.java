class Solution {
    public int leastInterval(char[] task, int n) {
        if(task.length==0 || task==null)
        {
            return 0;
        }
        int cnt[]=new int[26];
        for(int i=0;i<task.length;i++)
        {
            cnt[task[i]-'A']++;
        }
        
        Arrays.sort(cnt);
        int max=cnt[25]-1;
        int space=max * n;
        for(int i=24;i>=0;i--)
        {
            space=space-Math.min(max,cnt[i]);
        }
        space = Math.max(0, space);
        return task.length+space;
    }
}