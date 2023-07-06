class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> res=new ArrayList<>();
        if(n<=2)
        {
            return res;
        }
        int p[]=new int[n+1];
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                p[i]=1;
            }
            else{
                p[i]=0;
            }

        }
        for(int i=1;i<=n/2;i++)
        {
            if(p[i]==1 && p[n-i]==1)
            {
                 ArrayList<Integer> list=new ArrayList<Integer>();
                list.add(i);
                list.add(n-i);
                res.add(list);
            }
        }
        return res;
    }
    public  boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}