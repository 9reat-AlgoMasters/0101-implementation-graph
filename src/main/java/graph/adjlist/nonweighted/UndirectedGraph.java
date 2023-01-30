package graph.adjlist.nonweighted;

import java.util.ArrayList;

public class UndirectedGraph {
    ArrayList<Integer>[] adjList;
    
    public UndirectedGraph(int size) {
        adjList = new ArrayList[size+1];
        for (int i=1; i<=size; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int v1, int v2) {
    	adjList[v1].add(v2);
        adjList[v2].add(v1);
    }
}
