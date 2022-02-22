package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjListGraph {

    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public AdjListGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " Vertices, " + E + " Edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int element = q.poll();
            System.out.print(element + " ");

            for (int i : adj[element]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }

        }
        System.out.println("\n");
    }

    public void dfs(int source) {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        st.push(source);
        visited[source] = true;
        while (!st.isEmpty()) {
            int element = st.pop();
            System.out.print(element + " ");
            for (int value : adj[element]) {
                if (!visited[value]) {
                    st.push(value);
                    visited[value] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjListGraph g = new AdjListGraph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        System.out.println(g);
        g.bfs(0);
        g.dfs(0);
    }

}
