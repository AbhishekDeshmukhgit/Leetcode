class Solution {
    
    public int similarPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(check(words[i],words[j]))
                {
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
    public boolean check(String s1,String s2)
    {
        HashSet<Character> h=new HashSet<Character>();
        HashSet<Character> h2=new HashSet<Character>();
        for(int i=0;i<s1.length();i++)
        {
            h.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++)
        {
            h2.add(s2.charAt(i));
        }
        return h.equals(h2);
        
        
    }
}