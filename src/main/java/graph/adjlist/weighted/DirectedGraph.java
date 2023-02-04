package graph.adjlist.weighted;
import java.util.ArrayList;

public class DirectedGraph {
    ArrayList<Node>[] adjList;
    
    public DirectedGraph(int size) {
    	adjList = new ArrayList[size+1];
        for (int i=1; i<=size; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int from, int to, int weight) {
    	adjList[from].add(new Node(to, weight));
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
