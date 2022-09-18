//https://leetcode.com/problems/reverse-integer/
class Solution {
    public int reverse(int x) {
        int res=0,n;
        while(x!=0)
        {
            n=x%10;
            x=x/10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && n> 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && n< -8)) return 0;
            res=res*10+n;
        }
        return res;
    }
}