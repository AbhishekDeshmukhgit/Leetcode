class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long)length * (long)width * (long)height;
        boolean isbulky=false;
        boolean isheavy=false;
        if(length>=10000 || width>=10000 || height >=10000 || mass>=10000 || vol>=1000000000)
        {
            isbulky=true;
        }
         if(mass>=100)
        {
            isheavy=true;
        } 
        if(isbulky && isheavy)
        {
            return "Both";
        }
        else if(isbulky)
        {
            return "Bulky";
        }
        else if(isheavy)
        {
            return "Heavy";
        }
        else{
            return "Neither";
        }
    }
}

