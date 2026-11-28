package DSA.Graph.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfsList = new ArrayList<>();
        int V = adj.size(); // to get number of edges
        boolean[] visited = new boolean[V]; // to track which all nodes are already visited

        int src = 0;
        Queue<Integer> que = new LinkedList<>(); // to maintain that every nearest node visited first
        visited[src]=true;
        que.add(src);

        while(!que.isEmpty()){
            int curr = que.poll();
            bfsList.add(curr);

            for(int i : adj.get(curr)){
                /* here we will go to each and every node which are adjacent to current node with the help of
                * adjacency matrix and check whether that node was visited earlier or not if not than it is
                * the next nearest node */
                if(!visited[i]){
                    que.add(i);
                    visited[i]=true;
                }
            }
        }
        // return the bfs list of graph
        return bfsList;
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

        ArrayList<Integer> res = bfs(adj);

        for (int x : res)
            System.out.print(x + " ");
    }
}
