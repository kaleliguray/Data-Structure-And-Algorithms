package src.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

    private int V; // number of vertices in Graph
    private int E; // number of edges in Graph
    private LinkedList<Integer>[] adj;

    public BreathFirstSearch(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];

        for (int v=0; v < V; v++){
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder builder =  new StringBuilder();
        builder.append(V + " vertices, " + E + " edges \n");
        for (int v=0; v < V; v++){
            builder.append(v + ": ");
            for (int w : adj[v]){
                builder.append(w + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public void breath_first_search(int source){
        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.offer(source);

        while (!queue.isEmpty()){
            int value = queue.poll();
            System.out.print(value + " ");

            for (int v : adj[value]){
                if (!visited[v]){
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }

    }

    public static void main(String[] args) {

        BreathFirstSearch graph = new BreathFirstSearch(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(2, 4);

        graph.breath_first_search(0);

    }

}
