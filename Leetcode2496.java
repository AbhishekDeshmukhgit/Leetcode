class Solution {
    public int maximumValue(String[] strs) {
        int res=0;
        for(int i=0;i<strs.length;i++)
        {
            boolean numeric=true;
         try {
            int num = Integer.parseInt(strs[i]);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        
        if(numeric)
        {
            res=Math.max(res,Integer.parseInt(strs[i]));
        }
        else{
            res=Math.max(res,strs[i].length());
        }
        }
        return res;
    }
}