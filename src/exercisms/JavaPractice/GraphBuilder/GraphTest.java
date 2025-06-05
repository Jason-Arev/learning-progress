package exercisms.GraphBuilder;

public class GraphTest {
    public static void main(String[] args) {
        // Create Graph with attributes
        Graph graph = new Graph();
        graph.setAttribute("type", "undirected");

        // Add nodes
        graph.node("A").node("B").node("C");

        // Add edges
        graph.edge("A", "B");
        graph.edge("A", "B"); // duplicate
        graph.edge("B", "C");

        // Print results
        System.out.println("=== Nodes ===");
        for (Node node : graph.getNodes()) {
            System.out.println(node);
        }

        System.out.println("\n=== Edges ===");
        for (Edge edge : graph.getEdges()) {
            System.out.println(edge);
        }

        System.out.println("\nTotal edges: " + graph.getEdges().size());
        System.out.println("Total nodes: " + graph.getNodes().size());

        System.out.println("\n=== Graph Attributes ===");
        System.out.println(graph.getAttributes());
    }
}

