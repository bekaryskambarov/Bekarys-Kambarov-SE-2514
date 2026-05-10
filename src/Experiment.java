public class Experiment {
    public void runTraversals(Graph g, int size) {
        System.out.println("\n--- Testing Graph Size: " + size + " ---");

        long startBFS = System.nanoTime();
        g.bfs(0);
        long endBFS = System.nanoTime();

        long startDFS = System.nanoTime();
        g.dfs(0);
        long endDFS = System.nanoTime();

        System.out.println("BFS Time: " + (endBFS - startBFS) + " ns");
        System.out.println("DFS Time: " + (endDFS - startDFS) + " ns");
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};
        for (int size : sizes) {
            Graph g = createRandomGraph(size);
            runTraversals(g, size);
        }
    }

    private Graph createRandomGraph(int size) {
        Graph g = new Graph();
        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }
        // Add random edges to ensure connectivity
        for (int i = 0; i < size; i++) {
            int target = (i + 1) % size; // Ensure at least a ring structure
            g.addEdge(i, target);
            if (i < size - 1) g.addEdge(i, (int)(Math.random() * size));
        }
        return g;
    }
}