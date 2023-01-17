class Solution {
    public int minFlipsMonoIncr(String s) {
        int one=0;
        int zero=0;
        int i=0;
        while(i<s.length() && s.charAt(i)=='0')
        {
            i++;
        }
        while(i<s.length())
        {
            if(s.charAt(i)=='1')
            {
                one++;
                i++;
            }
            else if(s.charAt(i)=='0'){
                zero++;
                i++;
            }
            if(zero>one)
            {
                zero=one;
            }
        }
        return zero;
    }
}