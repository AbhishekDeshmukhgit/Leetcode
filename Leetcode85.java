class Solution {
    public int maximalRectangle(char[][] mat) {
        int ans[]=new int[mat[0].length];
        int maximum=0;
        int row=mat.length,col=mat[0].length;
        int[][] matrix=new int[row][col];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                matrix[i][j]=mat[i][j]-'0';
            }
        }
        
                    System.out.println(Arrays.toString(ans));
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    ans[j]=0;
                }
                else{
                    ans[j]=ans[j]+matrix[i][j];
                }
            }

            System.out.println(Arrays.toString(ans));
            maximum=Math.max(largestRectangleArea(ans),maximum);
        }
        return maximum;
    }
    public int largestRectangleArea(int[] heights) {
        int left[]=new int[heights.length];
        int right[]=new int[heights.length];
        left=leftsmallest(heights);
        right=rightsmallest(heights);
        
        int width[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            width[i]=right[i]-left[i]-1;
            if(width[i]<0)
            {
                width[i]=1;
            }
        }

        // System.out.println(Arrays.toString(width));
        int res[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            res[i]=width[i]*heights[i];
        }
        int maximum=-1;
        for(int i=0;i<res.length;i++)
        {
            maximum=Math.max(maximum,res[i]);
        }
        return maximum;
    }
    public int[] rightsmallest(int arr[])
    {
        Stack<Integer> st=new Stack<Integer>();
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                res[i]=arr.length;
            }
            else{
                if(arr[st.peek()]<arr[i])
                {
                    res[i]=st.peek();
                }
                else{
                    while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                    {
                        st.pop();
                    }
                    if(st.isEmpty())
                    {
                        res[i]=arr.length;
                    }
                    else{
                        res[i]=st.peek();
                    }
                }
            }
            st.push(i);
        }
        return res;
    }
    public int[] leftsmallest(int arr[])
    {
        Stack<Integer> st=new Stack<Integer>();
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(st.isEmpty())
            {
                res[i]=-1;
            }
            else{
                if(arr[st.peek()]<arr[i])
                {
                    res[i]=st.peek();
                }
                else{
                    while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                    {
                        st.pop();
                    }
                    if(st.isEmpty())
                    {
                        res[i]=-1;
                    }
                    else{
                        res[i]=st.peek();
                    }
                }
            }
            st.push(i);
        }
        return res;
    }
}