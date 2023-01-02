class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag=Character.isUpperCase(word.charAt(0));
        if(Upper(word) || lower(word) || ( flag && lower(word.substring(1,word.length()))))
        {
            return true;
        }
        return false;
    }
    public boolean Upper(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if(!Character.isUpperCase(word.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    public boolean lower(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            if(!Character.isLowerCase(word.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}