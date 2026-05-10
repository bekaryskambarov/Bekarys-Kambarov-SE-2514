public class Main {
    public static void main(String[] args) {
        // Small Graph Demo
        Graph smallGraph = new Graph();
        for (int i = 0; i < 10; i++) smallGraph.addVertex(new Vertex(i));
        // Add some edges
        smallGraph.addEdge(0, 1);
        smallGraph.addEdge(1, 2);
        smallGraph.addEdge(2, 3);

        System.out.println("=== SMALL GRAPH DEMO ===");
        smallGraph.printGraph();
        smallGraph.bfs(0);
        smallGraph.dfs(0);

        // Run Experiments
        System.out.println("\n=== RUNNING PERFORMANCE EXPERIMENTS ===");
        Experiment experiment = new Experiment();
        experiment.runMultipleTests();
    }
}