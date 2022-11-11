//Naive Solution
class Solution {
    public boolean searchMatrix(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (BinarySearch(arr[i], 0, arr[i].length-1, key)) {
                return true;
            }

        }
        return false;
    }
    public Boolean BinarySearch(int arr[], int start, int end, int key) {
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}

//Optimised Solution
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row=0;
        int col=matrix[0].length-1,n=matrix.length;
        while(col>=0 && row<n)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(target>matrix[row][col])
            {
                row++;
            }
            else if(target<matrix[row][col]){
                col--;
            }
        }
        return false;
    }
    
}
