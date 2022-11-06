class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> h = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++)
        {
            h.put(heights[i],names[i]);
        }
        String s[]=new String[names.length];
        int j=0;
        for(Map.Entry<Integer,String> e:h.entrySet())
        {
            s[j]=e.getValue();
            j++;
        }
        return s;
    }
}