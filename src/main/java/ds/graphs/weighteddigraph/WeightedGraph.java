package ds.graphs.weighteddigraph;

import sun.awt.CGraphicsConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightedGraph {
    public static void main (String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 6),
                new Edge(1, 2, 7),
                new Edge(2, 0, 5), new Edge(2, 1, 4),
                new Edge(3, 2, 10),
                new Edge(4, 5, 1),
                new Edge(5, 4, 3)
                );

        Graph graph = new Graph(edges);
        Graph.printGraph(graph);
    }
}

class Edge {
    int src, dest, weight;

    Edge (int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Node {
    int value, weight;

    Node(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.value + " (" + this.weight + ")";
    }
}

class Graph {
    List<List<Node>> adj = new ArrayList<>();

    public Graph(List<Edge> edges) {
        int n = 0;
        for (Edge e: edges) {
            n = Integer.max(n, Integer.max(e.src, e.dest));
        }

        for(int i = 0; i <=n; i++) {
            adj.add(i, new ArrayList<>());
        }

        for(Edge e: edges) {
            adj.get(e.src).add(new Node(e.dest, e.weight));
        }
    }

    public static void printGraph(Graph graph) {
        int src = 0;
        int n = graph.adj.size();

        while (src < n) {
            for (Node edge: graph.adj.get(src)) {
                System.out.printf("%d --> %s\t", src, edge);
            }

            System.out.println();
            src++;
        }
    }
}