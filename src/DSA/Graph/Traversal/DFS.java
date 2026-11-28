package DSA.Graph.Traversal;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {

    public static void dfsIteratively(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node, ArrayList<Integer> dfsList) {
        Stack<Integer> stk = new Stack<>(); // to track node
        stk.add(node);
        visited[node]=true; // to track visited node

        while(!stk.isEmpty()){
            /* we will first take the node from stack add in dfsList and then add all its
             * neighbor to stack if not visited earlier since it is a stack it will follow
             * LIFO principle hence it will go in depth first*/
            int curr = stk.pop();
            dfsList.add(curr);
            for(int i: adj.get(curr)){
                if(!visited[i]){
                    stk.add(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static void dfsByRecursion(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node, ArrayList<Integer> dfsList) {
        visited[node]=true; // mark the node visited
        dfsList.add(node); // add the node in list

        for(int n : adj.get(node)){
            /* if nodes are not visited then call dfs for the node else not.
            * by recursion, we are making sure that we are going into depth first*/
            if(!visited[n]) dfsByRecursion(adj, visited, n, dfsList);
        }
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
        int v = adj.size(); // to calculate number of node
        boolean[] visited = new boolean[v]; // to track visited nodes
        ArrayList<Integer> dfsList = new ArrayList<>(); // to store the traversal
        dfsIteratively(adj,visited,0,dfsList); // calling dfs method
        return dfsList; // returning the list.
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // creating adjacency list
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 0);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);

        // Perform DFS starting from vertex 0
        ArrayList<Integer> res = dfs(adj);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
