package exercims.GraphBuilder;
import java.util.*;

public final class Edge {
    private final String start;
    private final String end;

    private final Map<String, String> attributes;
    
    public Edge(String start, String end) {
        this.start = start;
        this.end = end;
        this.attributes = Collections.emptyMap();
    }
    
    public Edge(String start, String end, Map<String, String> attributes) {
        this.start = start;
        this.end = end;
        this.attributes = Map.copyOf(attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, attributes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Edge)) return false;
        Edge other = (Edge) obj;
        return Objects.equals(start, other.start) && Objects.equals(end, other.end) && Objects.equals(attributes, other.attributes);
    }

    @Override
    public String toString() {
        return "Edge [start=" + start + ", end=" + end + ", attributes=" + attributes + "]";
    }

}
