class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int res1= solve(answerKey,k);
        char ch[]=answerKey.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='T')
            {
                ch[i]='F';
            }
            else if(ch[i]=='F')
            {
                ch[i]='T';
            }
        }
        String t=new String(ch);
        System.out.println(t);
        return Math.max(res1,solve(t,k));
    }
    public int solve(String str,int k)
    {
        char ch[]=str.toCharArray();
        int i=0,j=0,res=0;
        while(j<ch.length)
        {
            if(ch[j]=='T')
            {
                res=Math.max(res,j-i+1);
                j++;
            }
            else if(ch[j]=='F' && k>0)
            {
                res=Math.max(res,j-i+1);
                j++;
                k--;
            }
            else if(ch[j]=='F' && k<=0)
            {
                while(k<=0)
                {
                    if(ch[i]=='T')
                    {
                        i++;
                    }
                    else if(ch[i]=='F')
                    {
                        k++;
                        i++;
                    }
                }
            }
        }
        return res;
    }
}