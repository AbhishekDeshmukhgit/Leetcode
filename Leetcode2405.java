class Solution {
    public int partitionString(String s) {
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                max++;
                h.clear();
            }
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        return max+1;
    }
}
