package graph.adjlist.weighted;
import java.util.ArrayList;

public class DirectedGraph {
    ArrayList<Node>[] adjList;
    
    public DirectedGraph(int size) {
    	//TODO : 생성자 구현 -> adjList 초기화
    	adjList = new ArrayList[size+1];
    	for(int i = 1 ; i < size + 1; i++) {
    		adjList[i] = new ArrayList<>();
    	}
    }
    
    public void addEdge(int from, int to, int weight) {
    	//TODO : 간선 추가 메서드 구현
    	Node node = new Node(to, weight);
    	adjList[from].add(node);
    }
    
    // 노드 번호와 weight를 저장하는 클래스 생성
    static class Node {
    	int nodeNumber;
        int weight;
    	
    	public Node(int nodeNumber, int weight) {
    		// TODO: 생성자 만들기 -> 파라미터 추가 필요!
    		this.nodeNumber = nodeNumber;
    		this.weight = weight;
    	}
    }
}

