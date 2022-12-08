class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String res="";;
        for(int i=0;i<k-1;i++)
        {
            res=res+str[i]+" ";
        }
        res=res+str[k-1];
        return res;
    }
}


//Optimized Solution
class Solution {
    public String truncateSentence(String s, int k) {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                k--;
            }
            if(k==0)
            {
                return s.substring(0,i);
            }
        }
        return s;
    }
}

