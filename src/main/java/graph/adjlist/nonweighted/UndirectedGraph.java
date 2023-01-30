package graph.adjlist.nonweighted;

import java.util.ArrayList;

public class UndirectedGraph {
    ArrayList<Integer>[] adjList;
    
    public UndirectedGraph(int size) {
    	//TODO : 생성자 구현 -> adjList 초기화
    	adjList = new ArrayList[size+1];
    	for(int i = 1 ; i < size + 1; i++) {
    		adjList[i] = new ArrayList<>();
    	}
    }
    
    public void addEdge(int v1, int v2) {
    	//TODO : 간선 추가 메서드 구현
    	adjList[v1].add(v2);
    	adjList[v2].add(v1);
    }
}

