class Solution {
    public boolean halvesAreAlike(String s) {
        int l1=Numberofvowels(s.substring(0,s.length()/2));
        int l2=Numberofvowels(s.substring(s.length()/2,s.length()));
        if(l1==l2){
            return true;
        }
        else{
            return false;
        }
    }
    int Numberofvowels(String s)
    {
        int count=0;
        char ch[]=s.toCharArray();
        String str="aeiouAEIOU";
        for(int i=0;i<s.length();i++)
        {
            if(str.contains(""+ch[i]))
            {
                count++;
            }
        }
        return count;
    }
}