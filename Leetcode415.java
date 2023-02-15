class Solution {
    public String addStrings(String num1, String num2) {
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(n1>=0 || n2>=0)
        {
          if(n1>=0 && n2>=0)
            {
                ans.append((num1.charAt(n1)-'0'+num2.charAt(n2)-'0'+carry)%10);
                carry=((num1.charAt(n1)-'0'+num2.charAt(n2)-'0'+carry)/10);
                n1--;
                n2--;
            }
            else if(n1>=0 && n2<0)
            {
               ans.append((num1.charAt(n1)-'0'+carry)%10);
                carry=((num1.charAt(n1)-'0'+carry)/10);
                n1--;
            }
            else{
                
               ans.append(((num2.charAt(n2)-'0'+carry)%10));
                carry=((num2.charAt(n2)-'0'+carry)/10);
                n2--;
            }
        }
        if(carry>0)
        {
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}