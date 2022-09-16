public class Leetcode2399 {
public static void main(String[] args) {
     int distance[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
     System.out.println(checkDistances("zz", distance));
    
}
    public static boolean checkDistances(String s, int[] distance) {
        
        for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        if(j-i-1!=distance[s.charAt(i)-'a']){
                            return false;
                        }    
                    }
                }         
            }
            return true;
        }

    
}