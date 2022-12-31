class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        boolean targetExists = false;
        for (String word : words) {
            if (word.equals(target)) {
                targetExists = true;
                break;
            }
        }
        if(!targetExists)
        {
            return -1;
        }
        
         int shortestdistance=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++)
        {
            int distance=0;
            if(i<startIndex)
            {
                distance=startIndex-i;
                int dstright=words.length-startIndex+i;
                if(dstright<distance)
                {
                    distance=dstright;
                }
            }
            else if(i>startIndex)
            {
                distance=i-startIndex;
                int dstleft=startIndex+words.length-i;
                if(dstleft<distance)
                {
                    distance=dstleft;
                }
            }
            if(words[i].equals(target))
            {
                shortestdistance=Math.min(distance,shortestdistance);
            }
        }
        return shortestdistance;    
        
        
    }
}