
class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            int ans=0;
             int m=edges.length;
            for(int i=0;i<n;i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i=0;i<m;i++){
                adj.get(edges[i][0]).add(edges[i][1]);
                adj.get(edges[i][1]).add(edges[i][0]);
            }
            return dfs(0,-1,adj,hasApple);
    }
      int dfs(int node, int par,ArrayList<ArrayList<Integer>> adj,List<Boolean> hasApple){
          int time=0;
          for(int it: adj.get(node)){
              if(it==par) continue;
              int gettime=dfs(it,node,adj,hasApple);
              if(gettime>0 || hasApple.get(it)){
                  time+=2+gettime;
              }
          }
         return time;
      }
}