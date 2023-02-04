package graph.adjmatrix.weighted;

public class UndirectedGraph {
    int[][] adjMatrix;
    
    public UndirectedGraph(int size) {
        adjMatrix = new int[size + 1][size + 1];
    	
    }
    
    public void addEdge(int v1, int v2, int weight) {
        adjMatrix[v1][v2] = weight;
    	adjMatrix[v2][v1] = weight;
    }
}
