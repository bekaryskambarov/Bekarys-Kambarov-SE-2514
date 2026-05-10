public class Edge {
    // These must be private as per your assignment requirements
    private final Vertex source;
    private final Vertex destination;

    // Constructor
    public Edge(Vertex source, Vertex destination) {
        this.source = source;
        this.destination = destination;
    }

    // Getters
    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    // The @Override must be PUBLIC to match java.lang.Object
    @Override
    public String toString() {
        // Using getId() to ensure we print the ID, not the object memory address
        return source.getId() + " -> " + destination.getId();
    }
}