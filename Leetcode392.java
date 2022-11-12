class Solution {
    public boolean isSubsequence(String first, String second) {
        int f=first.length();
        int s=second.length();
        if(s<f)
            return false;
        int i=0,j=0;
        while(i<f && j<s)
        {
            if(first.charAt(i)==second.charAt(j))
            {
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return (i==f);
    }
}