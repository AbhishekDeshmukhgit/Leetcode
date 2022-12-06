class Solution {
    public boolean isCircularSentence(String sentence) {
        String arr[] = sentence.split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].charAt(arr[i].length() - 1) != arr[i + 1].charAt(0)) {
                System.out.println(arr[i].charAt(arr[i].length() - 1));
                System.out.println(arr[i + 1].charAt(arr[i + 1].length() - 1));
                return false;
            }
        }
        int index = arr.length - 1;
        if (arr[index].charAt(arr[index].length() - 1) != arr[0].charAt(0)) {
            return false;
        } else {
            return true;
        }
    }
}