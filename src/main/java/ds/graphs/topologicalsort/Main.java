package ds.graphs.topologicalsort;

import java.util.*;

public class Main {

    public static List<Integer> sort(Graph graph) {
        LinkedList<Integer> queue = new LinkedList<>();

        Map<Integer, Integer> indegreeMap = new HashMap<>();

        for (int vertex = 0; vertex < graph.getNumVertices(); vertex++) {
            int indegree = graph.getIndegree(vertex);

            indegreeMap.put(vertex, indegree);

            if (indegree == 0) {
                queue.add(vertex);
            }
        }

        List<Integer> sortedList = new ArrayList<>();

        while (!queue.isEmpty()) {

            // NOTE: If more than one element exists then it means that the graph
            // has more than one topological sort solution.

            int vertex = queue.remove();

            // NOTE: This is the equivalent of processing the list
            sortedList.add(vertex);

            List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);

            for (int adjacentVertex : adjacentVertices) {
                int updatedIndegree = indegreeMap.get(adjacentVertex) - 1;
                indegreeMap.put(adjacentVertex, updatedIndegree);

                if (updatedIndegree == 0) {
                    queue.add(adjacentVertex);
                }
            }
        }

        if (sortedList.size() != graph.getNumVertices()) {
            throw new RuntimeException("The graph had a cycle");
        }

        return sortedList;
    }

    public static List<String> order(List<String> courseList, Map<String, List<String>> prereqs) {
        Graph courseGraph = new AdjacencyMatrixGraph(courseList.size(), Graph.GraphType.DIRECTED);

        Map<String, Integer> courseIdMap = new HashMap<>();
        Map<Integer, String> idCourseMap = new HashMap<>();

        for (int i = 0; i < courseList.size(); i++) {
            courseIdMap.put(courseList.get(i), i);
            idCourseMap.put(i, courseList.get(i));
        }

        for (Map.Entry<String, List<String>> prereq : prereqs.entrySet()) {
            for (String course : prereq.getValue()) {

            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new AdjacencyMatrixGraph(8, Graph.GraphType.DIRECTED);

        graph.addEdge(2, 7);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(2, 1);
        graph.addEdge(1, 3);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 7);

        graph.displayGraph();

        System.out.println("\n------------------------------------------\n");

        System.out.println(sort(graph));

        System.out.println("\n\n------------------------------------------\n");
    }
}
