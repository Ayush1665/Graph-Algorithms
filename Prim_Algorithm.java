public class Prim_Algorithm {
  class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
      this.first = first;
      this.second = second;
    }
  }

  class Solution {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
      PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.first - y.first);
      pq.add(new Pair(0, 0));
      int sum = 0;
      boolean[] vis = new boolean[V];
      while (!pq.isEmpty()) {
        Pair it = pq.poll();
        int node = it.second;
        int wt = it.first;
        if (vis[node]) continue;
        vis[node] = true;
        sum += wt;

        for (ArrayList<Integer> iter : adj.get(node)) {
          int adjNode = iter.get(0);
          int edgeWeight = iter.get(1);
          if (!vis[adjNode]) {
            pq.add(new Pair(edgeWeight, adjNode));
          }
        }
      }
      return sum;
    }
  }
}
