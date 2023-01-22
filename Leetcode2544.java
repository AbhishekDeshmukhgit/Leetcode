class Solution {
    public int alternateDigitSum(int n) {
        
        String str=Integer.toString(n);
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(i%2!=0)
            {
                sum=sum-Integer.parseInt(str.charAt(i)+"");
            }
            else{
                sum=sum+Integer.parseInt(str.charAt(i)+"");
            }
            
                
        }
        return sum;
        
    }
}