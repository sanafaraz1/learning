package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph {
    int numberOfNodes;
    Map<Integer, List<Integer>> adjacencyList;

    public MyGraph() {
        adjacencyList = new HashMap<Integer, List<Integer>>();
    }

    public void addVertex(Integer node) {
        adjacencyList.put(node, new ArrayList<Integer>());
        numberOfNodes++;
    }

    public void addEdge(Integer node1, Integer node2) {
        adjacencyList.get(node1).add(node2);
        adjacencyList.get(node2).add(node1);
    }

    public void showConnections() {
        for (Integer node : adjacencyList.keySet()) {
            List<Integer> edges = adjacencyList.get(node);
            System.out.print(node + "-->");
            for (Integer edge : edges) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        MyGraph graph = new MyGraph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);
        graph.showConnections();

    }
}
