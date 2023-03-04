class Solution {
    public int splitNum(int num) {
        String str=num+"";
        int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        String num1="",num2="";
        for(int i=0;i<arr.length;i++)
        {
            if(num1.length()==num2.length())
            {
                num1=num1+arr[i];
            }
            else{
                num2=num2+arr[i];
            }
        }
        return Integer.parseInt(num1)+Integer.parseInt(num2);
        
    }
}