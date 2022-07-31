import java.util.*;



public class DfsInGraph {


    static void dfs(int current, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer>ans, int[]visited){
        ans.add(current);

        for(int i= 0; i< adj.get(current).size(); i++){
            int nextConnection = adj.get(current).get(i);

            if(visited[nextConnection] ==0){
                visited[nextConnection] =1;
                dfs(nextConnection, adj, ans, visited);
            }


        }


    }
public static ArrayList<Integer> dfsInGraphs(int vertices, ArrayList<ArrayList<Integer>> adj){
    ArrayList<Integer> ans = new ArrayList<>();

    int [] visited = new int[vertices];
    for(int i =0; i<vertices; i++){
        visited[i] =0;
    }
    visited[0] =1;
    dfs(0, adj, ans, visited);
    return ans;
}



    public static void main(String[] args) {

    }
}
