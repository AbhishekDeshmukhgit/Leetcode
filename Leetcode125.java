class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char ch[] = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            if (ch[i] == ch[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}