class Solution {
    public int findMinArrowShots(int[][] arr) {
        int points[][]=removeDuplicateRows(arr);

        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        int count=1;
        int arrow=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(arrow>=points[i][0] && arrow<=points[i][1])
            {
                continue;
            }
            else{
               count++;
                arrow=points[i][1];
            }
        }
        return count;
    }
    
  public static int[][] removeDuplicateRows(int[][] array) {
    Set<String> uniqueRows = new HashSet<>();
    int[][] result = new int[array.length][];
    int index = 0;
    for (int[] row : array) {
      String rowString = Arrays.toString(row);
      if (!uniqueRows.contains(rowString)) {
        uniqueRows.add(rowString);
        result[index++] = row;
      }
    }
    return Arrays.copyOf(result, index);
  }
}

//Optimised Approach
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int ans=1;
        int arrow=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>arrow)
            {
                ans++;
                arrow=points[i][1];
            }
        }
        return ans;
    }
}
