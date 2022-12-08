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