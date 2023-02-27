class Solution {
    public int[] divisibilityArray(String word, int m) {
        int div[]=new int[word.length()];
        long x=0;
        for(int i=0;i<word.length();i++)
        {
            x=x*10+(word.charAt(i)-'0');
            if(x%m==0)
            {
                div[i]=1;
            }
            else{
                div[i]=0;
            }
            x=x%m;
        }
        return div;
    }
}