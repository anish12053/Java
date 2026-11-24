package DSA.Graph;

import java.util.ArrayList;

public class AdjacenyList {
    public static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<V;i++) graph.add(new ArrayList<>());

        //for undirected graph
        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        /* for directed graph
        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            graph.get(u).add(v);
        }
         */

        return graph;
    }

    public static void main(String[] args) {
        int V = 3;

        // List of edges (u, v)
        int[][] edges = { {0, 1}, {0, 2}, {1, 2} };

//        int[][] edges = { {1, 0}, {1, 2}, {2, 0} };

        // Build the graph using edges
        ArrayList<ArrayList<Integer>> adj = createGraph(V, edges);

        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < V; i++) {

            // Print the vertex
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {

                // Print its adjacent
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
