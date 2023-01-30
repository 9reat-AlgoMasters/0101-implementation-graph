package graph.adjmatrix.nonweighted;

public class DirectedGraph {
    int[][] adjMatrix;
    
    public DirectedGraph(int size) {
        adjMatrix = new int[size + 1][size + 1];
    }
    
    public void addEdge(int from, int to) {
        adjMatrix[from][to] = 1;
    }
}
