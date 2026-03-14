public class Dijkstra_Algorithm {
  static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
    int[] dist = new int[V];
    for (int i = 0; i < V; i++) {
      dist[i] = (int)(1e9);
    }

    dist[S] = 0;
    
    PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.first - y.first);
    pq.add(new Pair(0, S));
    while (!pq.isEmpty()) {
      Pair it = pq.poll();
      int node = it.second;
      int dis = it.first;

      for (ArrayList<Integer> iter : adj.get(node)) {
        int edgeWeight = iter.get(1);
        int adjNode = iter.get(0);
        if (dis + edgeWeight < dist[adjNode]) {
          dist[adjNode] = dis + edgeWeight;
          pq.add(new Pair(dist[adjNode], adjNode));
        }
      }
    }
    return dist;
  }
}
