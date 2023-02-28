class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<hand.length;i++)
        {
            p.offer(hand[i]);
        }
        while(p.size()!=0)
        {
            int start=p.poll();
            for(int i=1;i<groupSize;i++)
            {
                if(p.remove(start+i))
                {
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}