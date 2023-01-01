class Solution {
    public int countDigits(int num) {
        int count=0;
        String str=num+"";
        for(int i=0;i<str.length();i++)
        {
            if(num % Integer.parseInt(""+str.charAt(i))==0)
            {
                count++;
            }
        }
        return count;
    }
}