class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp,pre=null; 
        for(int i=0;i<numRows;i++)
        {
            temp=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    temp.add(1);
                }
                else{
                    temp.add(pre.get(j-1)+pre.get(j));
                }

            }
            pre=temp;
            res.add(temp);
        }
        return res;
    }
}