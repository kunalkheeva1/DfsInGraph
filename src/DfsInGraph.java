import java.util.*;



public class DfsInGraph {

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
