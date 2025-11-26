public static List<Integer> bfs(List<List<Integer>> adj) {
    List<Integer> bfs = new ArrayList<>();
    int n = adj.size();
    boolean[] visited = new boolean[n];
    Queue<Integer> q = new LinkedList<>();

    q.add(0); // Start BFS from node 0
    visited[0] = true; // Mark node 0 as visited

    while (!q.isEmpty()) {
        Integer node = q.poll(); // Remove node from queue
        bfs.add(node); // Add node to BFS traversal list

        // Visit all unvisited neighbors of the current node
        for (Integer it : adj.get(node)) {
            if (!visited[it]) {
                visited[it] = true; // Mark neighbor as visited
                q.add(it); // Add neighbor to queue
            }
        }
    }
    return bfs;
}
