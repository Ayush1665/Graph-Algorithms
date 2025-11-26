
public static List<Integer> dfs(List<List<Integer>> adj) {
  boolean[] visited = new boolean[adj.size() + 1];
  ArrayList<Integer> ls = new ArrayList<>();
  dfsOfGraph(0, visited, adj, ls);
  return ls;
}

public static void dfsOfGraph(int node, boolean[] visited, List<List<Integer>> adj, List<Integer> ls) {
  ls.add(node);
  visited[node] = true;

  for (Integer it : adj.get(node)) {
    if (!visited[it]) {
      dfsOfGraph(it, visited, adj, ls);
    }
  }
}
