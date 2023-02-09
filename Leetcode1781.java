class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int size=3;size<=s.length();size++)
        {
            int i=0;
            int j=size;
            int freq[]=new int[26];
            for(int k=i;k<j;k++)
            {
                freq[s.charAt(k)-'a']++;
            }
            ans=ans+beauty(freq);
            while(j<s.length())
            {
                freq[s.charAt(j)-'a']++;
                freq[s.charAt(i)-'a']--;
                
                ans=ans+beauty(freq);
                j++;
                i++;
            }
        }
        return ans;
    }
    public int beauty(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
            }
            
        }
        
        return max-min;
    }
}