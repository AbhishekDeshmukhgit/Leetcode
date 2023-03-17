class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int length=s.length();
        int char_count[]=new int[26];
        int currmax=0;
        int res=0;
        for(int i=0;i<length;i++)
        {
            char_count[s.charAt(i)-'A']++;
            currmax=Math.max(currmax,char_count[s.charAt(i)-'A']);

            while(i-start-currmax+1>k)
            {
                char_count[s.charAt(start)-'A']--;
                start++;
            }
            res=Math.max(res,i-start+1);
        }
        return res;
    }
}