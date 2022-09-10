package graph;

// Disjoint Set : A Sets which are disjoint

// disjoint Set have 2 functions
// find() : is used to find the parent Node
// Union() : is used for union of nodes
public class DisjointSet {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(9);
        uf.find(4);
        uf.union(4, 5);
        uf.union(4, 1);
        uf.union(4, 2);
        uf.display();
        System.out.println(uf.connected(4, 1));
        System.out.println(uf.connected(4, 2));
        System.out.println(uf.connected(4, 6));

    }
}

class UnionFind {
    private int[] root;

    // constructor method
    public UnionFind(int size) {
        root = new int[size];
        // store the value
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    // TC : O(1)
    // SC : O(1)
    public int find(int x) {
        // return parent node
        // System.out.println(root[x]);
        return root[x];
    }

    public void union(int node1, int node2) {
        int rootX = find(node1);
        int rootY = find(node2);

        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                // we can match with anyone rootX or rootY
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public void display() {
        for (int i = 0; i < root.length; i++) {
            System.out.println(root[i] + " " + i);
        }
    }

}
