class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int max=0;
	int i=0;
	while(i<s.length() && s.charAt(i)!='0'){
	i++;
	}
    int z=0,one=0;
	while(i<s.length())
    {
        if(s.charAt(i)=='0')
        {
            z++;
            one=0;
            i++;
        }
        else{
            int zero=z;
            z=0;
            int j=i;
        while(j<s.length() && s.charAt(j)=='1')
        {
            if(zero>0)
            {
                
            one++;
            
            zero--;
            }
            j++;
        }
        max=Math.max(max,one);
        i=j;
        }
      

    }
    return max*2;
    }
}