class Solution {
    public int addDigits(int num) {
        while(num/10>0)
        {
            num=add(num);
        }
        return num;

    }
    public int add(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}