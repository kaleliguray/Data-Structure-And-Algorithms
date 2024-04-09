package src.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstSearch {

    private int V; // number of vertices in Graph
    private int E; // number of edges in Graph
    private LinkedList<Integer>[] adj;

    public DepthFirstSearch(int nodes){
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

    public void depth_first_search(int source){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()){
            int value = stack.pop();

            if (!visited[value]){
                visited[value] = true;
                System.out.print(value + " ");

                for (int v : adj[value]){
                    if (!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {


        DepthFirstSearch graph = new DepthFirstSearch(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(2, 4);

        graph.depth_first_search(0);


    }


}
