// Flood Fill Algorithm

// Flood Fill Algorithm is a method to fill an area that is connected to a starting point.
// ➡️ Flood fill = DFS/BFS on a grid (2D array)
// ➡️ You start from a cell
// ➡️ Spread to all connected cells that have the same original value

// KEY IDEA: 
// We have a grid image[][]
// We start from cell (sr, sc)
// We change its value, then move to all 4 neighbors.
// We continue only if:
// The cell is inside bounds
// It has the original color
// It’s not visited


public int[][] floodFill(int[][] image, int sr, int sc, int color) {
  int original = image[sr][sc];

  // If the starting cell already has the color, no need to fill
  if(original == color) return;

  // DFS from (sr, sc)
  fill(image, sr, sc, original, color);  
}

public void fill(int[][] grid, int r, int c, int original, int newColor) {

  // If cell goes out of grid -> stop
  if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) return;

  // If cell is not original color -> not fill color, stop
  if(grid[r][c] != original) return;

  // Find current cell
  grid[r][c] = newColor;

  // Explore all neighbors (4 Direction)
  fill(grid, r+1, c, original, newColor);   // Down
  fill(grid, r-1, c, original, newColor);   // Up
  fill(grid, r, c+1, original, newColor);   // Right
  fill(grid, r, c-1, original, newColor);   // Left

}