package exercims.GraphBuilder;
import java.util.*;

public class Graph {
    private final Map<String, Node> nodes = new HashMap<>();
    private final Set<Edge> edges = new HashSet<>();
    private final Map<String, String> attributes;

    public Graph() {
        this.attributes = new HashMap<>();
    }

    public Collection<Node> getNodes() {
        return nodes.values();
    }

    public Collection<Edge> getEdges() {
       return edges;
    }

    public Graph node(String name) {
        Node newNode = new Node(name);
        nodes.put(name, newNode);
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        Node newNode = new Node(name, attributes);
        nodes.put(name, newNode);
        return this;
    }

    public Graph edge(String start, String end) {
        Edge newEdge = new Edge(start, end);
        edges.add(newEdge);
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge newEdge = new Edge(start, end, attributes);
        edges.add(newEdge);
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttribute(String key, String value) {
        attributes.put(key, value);
    }



}