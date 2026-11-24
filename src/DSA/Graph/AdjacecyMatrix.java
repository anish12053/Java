package DSA.Graph;

import java.util.ArrayList;
import java.util.Collections;

public class AdjacecyMatrix {
    public static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i <V;i++){
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V,0));
            graph.add(row);
        }

        //for undirected graph
        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            graph.get(u).set(v,1);
            graph.get(v).set(u,1);
        }

        //for directed graph
        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            graph.get(u).set(v,1);
        }
        return graph;
    }

    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {{1, 0},{2, 0},{1, 2}};

        ArrayList<ArrayList<Integer>> graph = createGraph(V,edges);

        System.out.println("Adjacency Matrix Representation:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++)
                System.out.print(graph.get(i).get(j) + " ");
            System.out.println();
        }
    }
}
