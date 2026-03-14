public class kahns_Algorithm {

  static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
    int[] indegree = new int[V];
    for (int i = 0; i < V; i++) {
      for (Integer it : adj.get(i)) {
        indegree[it]++;
      }
    }

    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < V; i++) {
      if (indegree[i] == 0) {
        q.add(i);
      }
    }

    int[] topo = new int[V];
    int ind = 0;
    while (!q.isEmpty()) {
      Integer node = q.poll();
      topo[ind++] = node;
      
      for (Integer it : adj.get(node)) {
        indegree[it]--;
        if (indegree[it] == 0) {
          q.add(it);
        }
      }
    }
    return topo;
  }
}
