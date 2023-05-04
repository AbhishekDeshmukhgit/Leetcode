class Solution {
    public String predictPartyVictory(String s) {
        int n=s.length();
        Queue<Integer> r=new ArrayDeque<Integer>();
        Queue<Integer> d=new ArrayDeque<Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                r.offer(i);
            }
            else{
                d.offer(i);
            }
        }
        while(!r.isEmpty() && !d.isEmpty())
        {
            int r1=r.poll();
            int d1=d.poll();
            if(r1<d1)
            {
                r.offer(r1+n);

            }
            else{
                d.offer(d1+n);
            }
        }
        if(r.isEmpty())
        {
            return "Dire";
        }
        else{
            return "Radiant";
        }

    }
}