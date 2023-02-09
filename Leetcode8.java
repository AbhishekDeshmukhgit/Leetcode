class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
        return 0;
        int index=0,res=0;
        boolean sign=false;
        while(index<s.length() &&s.charAt(index)==' ')
        {
            index++;
        }
        if(index<s.length() && (s.charAt(index)=='+' || s.charAt(index)=='-'))
        {
            sign=s.charAt(index)=='-'?true:false;
            index++;
        }
        while(index<s.length())
        {
            int digit=s.charAt(index)-'0';
            if(digit<0 || digit>9)
            {
                break;
            }
            if(Integer.MAX_VALUE/10<res || Integer.MAX_VALUE/10==res && Integer.MAX_VALUE %10 < digit )
            {
                return sign?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res=res*10+digit;
            index++;
        }
        if(sign)
        {

            return res*-1;
        }
        return res;
    }
}