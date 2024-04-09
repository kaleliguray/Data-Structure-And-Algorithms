package src.graph;

public class Graph {

    private int V; // number of vertices in Graph
    private int E; // number of edges in Graph
    int[][] adjMatrix;

    public Graph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v){
        // due to an undirected graph
        this.adjMatrix[v][u] = 1;
        this.adjMatrix[u][v] = 1;
        E++;
    }

    public String toString(){
        StringBuilder builder =  new StringBuilder();
        builder.append(V + " vertices, " + E + " edges \n");
        for (int v=0; v < V; v++){
            builder.append(v + ": ");
            for (int w : adjMatrix[v]){
                builder.append(w + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);

        System.out.println(graph);

    }

}
