class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int fuel=0;
        int total=0;
        for(int i=0;i<gas.length;i++)
        {
            fuel=fuel+gas[i]-cost[i];
            if(fuel<0)
            {
                total=total+fuel;
                fuel=0;
                start=i+1;
            }
        }
        total=total+fuel;
       return (total<0) ?  -1: start;
    }
}