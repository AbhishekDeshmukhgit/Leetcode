class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        int i=0,j=0;
        while(i<=players.length-1 && j<=trainers.length-1)
        {
            if(players[i]<=trainers[j])
            {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}