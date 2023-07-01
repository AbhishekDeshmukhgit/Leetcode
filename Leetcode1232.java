class Solution {
    public boolean checkStraightLine(int[][] arr) {
        if(arr.length==2)
        {
            return true;
        }
        int a1=arr[0][0],b1=arr[0][1],a2=arr[1][0],b2=arr[1][1];
        
        for(int i=2;i<arr.length;i++)
        {
            int x1=arr[i-1][0],y1=arr[i-1][1],x2=arr[i][0],y2=arr[i][1];
            
            if((x2-x1)*(b2-b1)!=(y2-y1)*(a2-a1))
            {
                return false;
            }
        }
        return true;
    }
}