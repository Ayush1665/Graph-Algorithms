// On Directed Acyclic Graph (DAG) -> Any linear ordering of vertices such that for every directed edge u -> v, vertex u comes before v in the ordering.
// Topological Sort

import java.util.*;

public class Topological_Sort {

    public static void dfs(int node, int vis[], Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs(it, vis, st, adj);
            }
        }
        st.push(node);
    }

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        int ans[] = new int[V];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.pop();
            st.pop();
        }
        return ans;
        
    }
}
