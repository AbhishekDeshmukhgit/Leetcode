class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=num+"";
        int i=0,j=0;
        String a="";
        int ans=0;
        while(j<s.length())
        {
            a=a+s.charAt(j);
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                 if(Integer.parseInt(a)!=0 && num%Integer.parseInt(a)==0)
                {
                    ans++;
                    
                }
                
                a=a.substring(1);
                i++;
                j++;

            }

        }
        return ans;
    }
}