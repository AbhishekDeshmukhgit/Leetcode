class Maze{
    public static void main(String[] args) {
        System.out.println(Count(3,3));
    }
    public static int Count(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=Count(r-1, c);
        int right=Count(r, c-1);
        return left+right;
    }
}