public class FloydWarshall_Algorithm {
 public void shortest_distance(int[][] matrix) {
        int V = matrix.length;
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (matrix[i][k] != -1 && matrix[k][j] != -1) {
                        if (matrix[i][j] == -1 || matrix[i][j] > matrix[i][k] + matrix[k][j]) {
                            matrix[i][j] = matrix[i][k] + matrix[k][j];
                        }
                    }
                }
            }
        }
    }
}
