class Solution {
    public String frequencySort(String s) {
        StringBuilder str = new StringBuilder();
        int count=0;
        HashMap<Character,Integer> h=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            h.put(ch[i],h.getOrDefault(ch[i],0)+1);
        }
       h= h.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue((e1, e2) -> e2-e1))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
                                      (e1, e2) ->e1, LinkedHashMap::new));
        for(Character c: h.keySet()) {
            count = h.get(c);
            while(count>0) {
                str.append(c);
                count--;
            }
        }
        return str.toString();
        
    }
}