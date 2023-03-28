class Solution {
    HashSet<Integer> h=new HashSet<Integer>();
    public boolean isHappy(int n) {
        while(n!=1 && !h.contains(n))
        {
            
            h.add(n);
            n=Sum(n);
        }
        if(n==1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public int Sum(int n)
    {
        int res=0;
        while(n!=0)
        {
            res=res+(n%10)*(n%10);
            n=n/10;
        }
        return res;
    }
}