import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger mult;
        BigInteger a= new BigInteger(num1);
        BigInteger b= new BigInteger(num2);
         mult = a.multiply(b);
        return mult.toString(10);
        
    }
}