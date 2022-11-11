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