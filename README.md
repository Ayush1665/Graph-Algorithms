# Graph Algorithms

This repository contains implementations of common **Graph Algorithms** used in computer science, competitive programming, and technical interviews.


## 1. Breadth First Search (BFS)

**Definition**

Breadth First Search is a graph traversal algorithm that explores nodes level by level starting from a source node.

**How it works**

* Start from a source node
* Visit all its neighbors
* Then visit neighbors of those neighbors
* Continue until all reachable nodes are visited

**Time Complexity**

O(V + E)

**Example Use Cases**

* Shortest path in an unweighted graph
* Finding connected components
* Web crawling
* Network broadcasting


## 2. Depth First Search (DFS)

**Definition**

Depth First Search is a traversal algorithm that explores as far as possible along each branch before backtracking.

**How it works**

* Start at a node
* Move to one neighbor
* Continue going deeper
* Backtrack when no more neighbors exist

**Time Complexity**

O(V + E)

**Example Use Cases**

* Cycle detection
* Topological sorting
* Solving puzzles like mazes
* Connected components in graphs


## 3. Bellman-Ford Algorithm

**Definition**

Bellman-Ford is a shortest path algorithm that works even when the graph contains **negative edge weights**.

**How it works**

* Relax all edges repeatedly
* Repeat V-1 times
* Detect negative weight cycles

**Time Complexity**

O(V × E)

**Example Use Cases**

* Graphs with negative edges
* Currency exchange systems
* Detecting negative cycles


## 4. Dijkstra’s Algorithm

**Definition**

Dijkstra’s Algorithm finds the **shortest path from a source node to all other nodes** in a weighted graph with non-negative edges.

**How it works**

* Use a priority queue
* Always choose the node with the smallest distance
* Update distances of neighbors

**Time Complexity**

O((V + E) log V)

**Example Use Cases**

* GPS navigation
* Network routing
* Map shortest path systems

## 5. Flood Fill Algorithm

**Definition**

Flood Fill is used to fill connected regions in a grid or matrix.

**How it works**

* Start from a given cell
* Replace its color
* Recursively update all adjacent cells with the same color

**Time Complexity**

O(N × M)

**Example Use Cases**

* Paint bucket tool in graphics editors
* Image processing
* Region detection in grids


## 6. Floyd-Warshall Algorithm

**Definition**

Floyd-Warshall computes **shortest paths between all pairs of vertices**.

**How it works**

* Use dynamic programming
* Check if going through an intermediate vertex improves distance

**Time Complexity**

O(V³)

**Example Use Cases**

* Network routing tables
* Distance calculations between all cities
* Graph analytics


## 7. Kahn’s Algorithm

**Definition**

Kahn’s Algorithm is used to perform **Topological Sorting** using **BFS and in-degree method**.

**How it works**

* Calculate in-degree of all nodes
* Add nodes with in-degree 0 to queue
* Remove them and update neighbors

**Time Complexity**

O(V + E)

**Example Use Cases**

* Course scheduling
* Dependency resolution
* Task ordering systems


## 8. Prim’s Algorithm

**Definition**

Prim’s Algorithm finds the **Minimum Spanning Tree (MST)** of a weighted graph.

**How it works**

* Start from any node
* Select the smallest edge connecting visited and unvisited nodes
* Repeat until all nodes are included

**Time Complexity**

O(E log V)

**Example Use Cases**

* Network design
* Cable laying optimization
* Road network construction

## 9. Topological Sort

**Definition**

Topological Sorting is a linear ordering of vertices in a **Directed Acyclic Graph (DAG)**.

**How it works**

* Order vertices so that
  for every directed edge **U → V**, U appears before V.

**Time Complexity**

O(V + E)

**Example Use Cases**

* Task scheduling
* Course prerequisite systems
* Build systems in software development

