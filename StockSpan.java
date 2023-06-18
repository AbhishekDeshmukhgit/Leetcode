import java.util.Arrays;
import java.util.Stack;

class Pair{
    int key,value;
    Pair(int key,int value)
    {
        this.key=key;
        this.value=value;
    }
}
class StockSpan{
    public static void main(String[] args) {
        // Stack<Pair> st=new Stack<Pair>();
        // st.push(new Pair(12, 15));
        // System.out.println(st.peek().key);
        int arr[]={100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int arr[]){
        int res[]=new int[arr.length];
        int gt[]=new int[arr.length];
        Stack<Pair> st=new Stack<Pair>();
        for(int i=0;i<arr.length;i++)
        {
            if(st.isEmpty())
            {
                gt[i]=-1;
            }
            else{
                
            if(st.peek().key>arr[i])
            {
                gt[i]=st.peek().value;
            }
            else{
                while(!st.isEmpty() && st.peek().key<=arr[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    gt[i]=-1;
                }
                else{
                    gt[i]=st.peek().value;
                }
            }
            }
            st.push(new Pair(arr[i],i));
        }
        for(int i=0;i<arr.length;i++)
        {
            res[i]=i-gt[i];
        }


        return res;

    }
}