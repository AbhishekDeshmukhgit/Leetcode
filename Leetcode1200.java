class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]<min)
            {
                min=arr[i+1]-arr[i];
                list.clear();
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
            else if(arr[i+1]-arr[i]==min)
            {
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }
}