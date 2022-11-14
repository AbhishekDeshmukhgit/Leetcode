class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length())
            return false;
        char a1[]=s.toCharArray();
        Arrays.sort(a1);
        s=new String(a1);
        char a2[]=t.toCharArray();
        Arrays.sort(a2);
        t=new String(a2);
        return s.equals(t);
    }
}