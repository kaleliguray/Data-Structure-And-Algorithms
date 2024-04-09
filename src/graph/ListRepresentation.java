package src.graph;

import java.util.LinkedList;

public class ListRepresentation {

    private int V; // number of vertices in Graph
    private int E; // number of edges in Graph
    private LinkedList<Integer>[] adj;

    public ListRepresentation(int nodes){
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

    public static void main(String[] args) {

        ListRepresentation graph = new ListRepresentation(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);

        System.out.println(graph);



    }

}
