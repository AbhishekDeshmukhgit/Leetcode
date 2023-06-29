class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> h1
            = new PriorityQueue<Integer>();
            PriorityQueue<Integer> h2
            = new PriorityQueue<Integer>();
        int index1=0;
        int index2=costs.length-1;
        int n=costs.length;
        for(index1=0;index1<candidates;index1++)
        {
            h1.add(costs[index1]);
        }
        for(index2=costs.length-1;index2>=candidates && index2>=n-candidates;index2--)
        {
            h2.add(costs[index2]);
        }
        long res=0;
        index1=candidates;
        index2=costs.length-candidates-1;
        while(k>0)
        {
            if(!h1.isEmpty() && !h2.isEmpty())
            {
                if(h1.peek()<=h2.peek())
                {
                    res=res+h1.peek();
                    h1.poll();
                    if(index1<=index2)
                    {
                        h1.add(costs[index1]);
                        index1++;
                    }
                }
                else{
                    res=res+h2.peek();
                    h2.poll();
                    if(index1<=index2)
                    {
                        h2.add(costs[index2]);
                        index2--;
                    }
                }
            }
            else if(!h1.isEmpty())
            {
                res=res+h1.peek();
                    h1.poll();
                    
            }
            else if(!h2.isEmpty())
            {
                res=res+h2.peek();
                    h2.poll();
                    

            }
            k--;
        }
        return res;
    }
}