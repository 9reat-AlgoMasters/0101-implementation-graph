package graph.adjmatrix.nonweighted;

public class UndirectedGraph {
    int[][] adjMatrix;
    
    public UndirectedGraph(int size) {
        adjMatrix = new int[size + 1][size + 1];
    }
    
    public void addEdge(int v1, int v2) {
    	adjMatrix[v1][v2] = 1;
        adjMatrix[v2][v1] = 1;
    }
}
