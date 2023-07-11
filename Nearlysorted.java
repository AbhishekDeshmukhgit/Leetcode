class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        PriorityQueue<Integer> p=new PriorityQueue<Integer>();
        int i=0;
        while(i<arr.length)
        {
            if(p.size()<k+1)
            {
                p.offer(arr[i]);
                i++;
            }
            else{
                list.add(p.peek());
                p.poll();
                p.offer(arr[i]);
                i++;
            }
            
        }
        while(p.size()!=0)
        {
            list.add(p.peek());
            p.poll();
        }
        return  list;
    }
}