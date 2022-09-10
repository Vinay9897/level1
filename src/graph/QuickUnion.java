package graph;

public class QuickUnion {

    // This is same as Disjoint Set program
    // but we had reduced the time complexity of the union function

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(9);
        uf.union(3, 6);
        uf.union(3, 7);
        uf.union(3, 8);
        uf.union(4, 1);
        uf.union(4, 2);
        uf.union(4, 5);
        uf.display();
        System.out.println(uf.connected(3, 8));
        // uf.isConnected(4, 5);

    }

}

class UnionFind {
    private int[] root;

    // constructor
    public UnionFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public boolean connected(int i, int j) {
        return find(i) == find(j);
    }

    public int find(int x) {
        while (x != root[x]) {
            x = root[x];
        }
        return x;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        // if node are not connected
        if (rootX != rootY) {
            // now rootY is parent
            root[rootX] = rootY;
        }
    }

    public void display() {
        for (int i = 0; i < root.length; i++) {
            System.out.println(root[i] + " " + i);
        }
    }
}
