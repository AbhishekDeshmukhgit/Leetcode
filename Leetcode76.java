class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        for(int i=0;i<t.length();i++)
        {
            h.put(t.charAt(i),h.getOrDefault(t.charAt(i),0)+1);
        }
        int i=0,j=0,count=h.size(),start=-1,end=-1,min=Integer.MAX_VALUE;
        while(i<s.length() && j<s.length())
        {
            if(h.containsKey(s.charAt(j)))
            {
                h.put(s.charAt(j),h.getOrDefault(s.charAt(j),0)-1);
                if(h.get(s.charAt(j))==0)
                {
                    count--;
                }
                j++;
            }
            else{
                j++;
            }
            if(count==0)
            {
                while(count==0)
                {
                    
                if(j-i+1<min)
                {
                    min=j-i+1;
                    start=i;
                    end=j;
                }
                if(h.containsKey(s.charAt(i)))
                {
                    h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
                    if(h.get(s.charAt(i))==1)
                    {
                        count++;
                    }
                }
                i++;
                }
            }

        }
        String res="";
        for(int p=start;p<end;p++)
        {
            res=res+s.charAt(p);
        }
        return res;
    }
}