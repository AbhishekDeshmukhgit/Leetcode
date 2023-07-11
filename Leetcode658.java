class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(k>0)
            {
                p.offer(arr[i]);
                k--;
            }
            else if(Math.abs(p.peek()-x)>Math.abs(arr[i]-x))
            {
                p.poll();
                p.offer(arr[i]);
            }
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(p.size()>0)
        {
            list.add(p.peek());
            p.poll();
        }
        return list;
    }
}
































