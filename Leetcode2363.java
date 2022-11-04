import java.util.*;
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] arr1, int[][] arr2) {
        TreeMap<Integer, Integer> h = new TreeMap<>();
        List<List<Integer>> list=new ArrayList<>();
        for (int arr[] : arr1) {
            h.put(arr[0], arr[1]);
        }
        for (int arr[] : arr2) {
            h.put(arr[0], h.getOrDefault(arr[0], 0) + arr[1]);
        }
        for(var i:h.entrySet())
        {
            list.add(Arrays.asList(i.getKey(),i.getValue()));
        }
   
        return list;
    }
                         
}