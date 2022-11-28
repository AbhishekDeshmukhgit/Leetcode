class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
         sum=sum+i;
           int temp=0;
            for(int j=i;j<=n;j++)
            {
                temp=temp+j;
            }
            if(sum==temp){
                return i;
            }
        }
        return -1;
    }
}
