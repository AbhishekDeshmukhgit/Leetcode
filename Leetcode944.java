class Solution {
    public int minDeletionSize(String[] strs) {
        int m = 0;
        String s="";
        for (int i = 0; i < strs[0].length(); i++) {
            for(int j=0;j<strs.length;j++)
            {
                s=s+strs[j].charAt(i);
            }
            if(!isLexicographicallySorted(s))
            {
                m++;
            }
            s="";
        }
        return m;
    }
    public static boolean isLexicographicallySorted(String word) {
        char[] wordChars = word.toCharArray();
        for (int i = 1; i < wordChars.length; i++) {
          if (wordChars[i] < wordChars[i - 1]) {
            return false;
          }
        }
        return true;
      }

}


//Optimised Approach

class Solution {
    public int minDeletionSize(String[] strs) {
        int m = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j-1].charAt(i)>strs[j].charAt(i))
                {
                    m++;
                    break;
                }
            }
            
        }
        return m;
    }
}