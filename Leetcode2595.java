class Solution {
    public int[] evenOddBit(int n) {
        StringBuilder s=new StringBuilder(Integer.toBinaryString(n));
        s.reverse();
        int res[]=new int[2];
        int even=0;
        int odd=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1' && i%2==0)
            {
                even++;
            }
            else if(s.charAt(i)=='1' && i%2!=0)
            {
                odd++;
            }
        }       
        res[0]=even;
        res[1]=odd;
        return res;
    }
}