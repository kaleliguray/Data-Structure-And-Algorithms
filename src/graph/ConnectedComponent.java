package src.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class represents an undirected graph and provides methods to find connected components.
 * @author giraykaleli
 * @see LinkedList
 *
 * Reference:
 * 1. hatGPT, Connected Components in Data Structure & Algorithm, 2024
 */

public class ConnectedComponent {
    private int V;
    private LinkedList<Integer> adj[];

    /**
     * Initializes a graph with the specified number of vertices.
     * @param v the number of vertices in the graph
     */
    ConnectedComponent(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    /**
     * Adds an undirected edge between two vertices.
     * @param v the first vertex
     * @param w the second vertex
     */
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    /**
     * Performs depth-first search traversal starting from the specified vertex.
     * @param v the starting vertex
     * @param visited an array to mark visited vertices
     */
    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    /**
     * Finds and prints connected components in the graph.
     */
    void connectedComponents() {
        boolean visited[] = new boolean[V];
        for (int v = 0; v < V; ++v) {
            if (!visited[v]) {
                DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        ConnectedComponent graph = new ConnectedComponent(5); // Example graph with 5 vertices
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(3, 4);

        System.out.println("Connected components:");
        graph.connectedComponents();
    }
}

