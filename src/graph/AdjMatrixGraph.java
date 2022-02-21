package graph;

public class AdjMatrixGraph {

    private int V; // no of Vertex in Graph
    private int E; // no of Edges in Edges

    private int[][] adjMatrix;

    public AdjMatrixGraph(int node) {
        this.V = node;
        this.E = 0;
        this.adjMatrix = new int[node][node];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;// because it is undirected graph
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " Vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adjMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AdjMatrixGraph g = new AdjMatrixGraph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(0, 2);
        System.out.println(g);
    }

}
