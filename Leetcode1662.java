class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one="";
        String two="";
        for(int i=0;i<word1.length;i++)
        {
            one=one+word1[i];
        }
       for(int i=0;i<word2.length;i++)
        {
            two=two+word2[i];
        }
        if(one.equals(two))
        {
            return true;
        }
        return false;
    }
}