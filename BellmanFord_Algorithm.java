public class BellmanFord_Algorithm {
  static int[] bellman_ford(int V, int E, int[][] edges, int S) {
    int[] dist = new int[V];
    for (int i = 0; i < V; i++) {
      dist[i] = (int)(1e9);
    }
    dist[S] = 0;

    for (int i = 0; i < V - 1; i++) {
      for (int j = 0; j < E; j++) {
        int u = edges[j][0];
        int v = edges[j][1];
        int wt = edges[j][2];
        if (dist[u] != (int)(1e9) && dist[u] + wt < dist[v]) {
          dist[v] = dist[u] + wt;
        }
      }
    }
    return dist;
  }
}
