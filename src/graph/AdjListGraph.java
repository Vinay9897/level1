package graph;

import java.util.LinkedList;

public class AdjListGraph {

    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public AdjListGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        // this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            // adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        // adj[u].add(v);
        // adj[v].add(u);
        E++;

    }

    public static void main(String[] args) {
        AdjListGraph g = new AdjListGraph(4);

    }

}