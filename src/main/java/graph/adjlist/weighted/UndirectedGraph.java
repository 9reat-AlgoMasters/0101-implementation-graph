package graph.adjlist.weighted;
import java.util.ArrayList;

public class UndirectedGraph {
    ArrayList<Node>[] adjList;
    
    public UndirectedGraph(int size) {
        adjList = new ArrayList[size+1];
        for (int i=1; i<=size; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int v1, int v2, int weight) {
    	adjList[v1].add(new Node(v2, weight));
        adjList[v2].add(new Node(v1, weight));
    }
    
    // 노드 번호와 weight를 저장하는 클래스 생성
    static class Node {
    	int nodeNumber;
        int weight;
        
    	public Node(int nodeNumber, int weight) {
    		this.nodeNumber = nodeNumber;
            this.weight = weight;
    	}
    }
}
