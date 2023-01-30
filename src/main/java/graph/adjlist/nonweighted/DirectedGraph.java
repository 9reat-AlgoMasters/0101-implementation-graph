package graph.adjlist.nonweighted;
import java.util.ArrayList;

public class DirectedGraph {
    ArrayList<Integer>[] adjList;
    
    public DirectedGraph(int size) {
    	adjList = new ArrayList[size+1];
        for (int i=1; i<=size; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int from, int to) {
    	adjList[from].add(to);
    }
}
