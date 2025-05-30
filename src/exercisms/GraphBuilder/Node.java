package exercisms.GraphBuilder;
import java.util.*;

public final class Node {
    private final String name;
    private final Map<String, String> attributes;

    public Node(String name) {
        this.name = name;
        this.attributes = Collections.emptyMap();
    }

    public Node(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = Map.copyOf(attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attributes);
    }

    @Override  
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Node)) return false;
        Node other = (Node) obj;
        return Objects.equals(name, other.name) && Objects.equals(attributes, other.attributes);
    }

    @Override
    public String toString() {
        return "Node [name=" + name + ", attributes=" + attributes + "]";
    }
}
