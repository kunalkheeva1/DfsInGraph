import java.util.*;



public class DfsInGraph {

    // provide the current(next) element to the code to traverse, as well as adjacent list of list of it,
    //also a list to store answer and an array to track the visited or non visited elements
    static void dfs(int current, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer>ans, int[]visited){
        //first add the element in answer and then run a loop thru the adjacent elements of that particular element
        // store the adjacent of the current in a variable and check if it is visited or not, if not then mark it vistited
        // then call again for the adjacent element this time. and it continues
        ans.add(current);

        for(int i= 0; i< adj.get(current).size(); i++){
            int nextConnection = adj.get(current).get(i);

            if(visited[nextConnection] ==0){
                visited[nextConnection] =1;
                dfs(nextConnection, adj, ans, visited);
            }


        }


    }
    //main method , get an array, to check if the element of the graph is visited or not, 1 for visited and 0 for not, mark 0 every element initially
    //and while adding mark first index as visited and then apply the algorithm
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
