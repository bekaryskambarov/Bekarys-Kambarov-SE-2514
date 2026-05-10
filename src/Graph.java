import java.util.*;

public class Graph {
    private final Map<Integer, Vertex> vertices = new HashMap<>();
    private final Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public void addVertex(Vertex v) {
        vertices.put(v.getId(), v);
        adjacencyList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to) {
        if (vertices.containsKey(from) && vertices.containsKey(to)) {
            adjacencyList.get(from).add(to);
            // For undirected graph, uncomment the next line:
            // adjacencyList.get(to).add(from);
        }
    }

    public void bfs(int start) {
        if (!vertices.containsKey(start)) return;

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        System.out.print("BFS Order: ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        if (!vertices.containsKey(start)) return;

        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Order: ");
        dfsRecursive(start, visited);
        System.out.println();
    }

    private void dfsRecursive(int current, Set<Integer> visited) {
        visited.add(current);
        System.out.print(current + " ");

        for (int neighbor : adjacencyList.get(current)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public void printGraph() {
        System.out.println("Graph Adjacency List:");
        for (int id : adjacencyList.keySet()) {
            System.out.println(id + " -> " + adjacencyList.get(id));
        }
    }
}
