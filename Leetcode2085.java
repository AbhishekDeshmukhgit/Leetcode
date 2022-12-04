class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        HashMap<String,Integer> h1=new HashMap<>();
        HashMap<String,Integer> h2=new HashMap<>();
        for(int i=0;i<words1.length;i++)
        {
            h1.put(words1[i],h1.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<words2.length;i++)
        {
            h2.put(words2[i],h2.getOrDefault(words2[i],0)+1);
        }
        for(int i=0;i<words1.length;i++)
        {
            if(h1.containsKey(words1[i]) && h1.get(words1[i])==1 && h2.containsKey(words1[i]) && h2.get(words1[i])==1) 
            {
                count++;
            }
        }
                return count;
    }
}