class Solution {
    public String simplifyPath(String path) {
        ArrayDeque<String> st=new ArrayDeque<String>();
        String arr[]=path.split("/");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(".") || arr[i].equals(""))
            {
                continue;
            }
            else if(!st.isEmpty() && arr[i].equals("..") )
            {
                st.pop();
            }
            else if(!arr[i].equals("") && !arr[i].equals(".") && !arr[i].equals("..")){
                st.push(arr[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        if(st.isEmpty()) return "/";

        while(!st.isEmpty())
        {
            sb.append("/"); 
           sb.append(st.pollLast());
        }

        return sb.toString();
    }
}
