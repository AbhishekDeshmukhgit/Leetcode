class Solution {
    public long dividePlayers(int[] skill) {
        long res=0;
        Arrays.sort(skill);
        int i=0,j=skill.length-1;
        long c1=skill[i]+skill[j];
        res=skill[i]*skill[j];
        i++;
        j--;
        while(i<j)
        {
            if(skill[i]+skill[j] != c1)
            {
                return -1;
            }
            else
            {
                c1=skill[i]+skill[j];
                res=res+(skill[i]*skill[j]);
                i++;
                j--;
            }
        }
        return res;
    }
}


