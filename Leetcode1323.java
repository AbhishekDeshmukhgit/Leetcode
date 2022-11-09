//Using String
class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        
        return Integer.parseInt(s.replaceFirst("6","9"));
    }
}