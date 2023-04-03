class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<j)
        {
            if(people[i]+people[j]<=limit)
            {
                count++;
                i++;
                j--;
            }
            else  if(people[j]<=limit)
            {
                count++;
                j--;
            }
            else{
                count++;
                i++;
            }
        }
        if(i==j && people[i]<=limit)
        {
            count++;
        }
        return count;
    }
}