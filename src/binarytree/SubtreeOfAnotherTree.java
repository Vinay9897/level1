package binarytree;

public class SubtreeOfAnotherTree {
    static boolean ans = false;

    public static void main(String[] args) {
        // tree
        Node2 tree = new Node2(3);
        tree.left = new Node2(2);
        tree.right = new Node2(1);
        tree.left.left = new Node2(11);
        tree.left.right = new Node2(10);

        // subtree
        Node2 subtree = new Node2(2);
        subtree.left = new Node2(11);
        subtree.right = new Node2(10);
        System.out.println(isSubTree(tree, subtree));
    }

    public static boolean isSubTree(Node2 root, Node2 subRoot) {
        inOrder(root, subRoot);
        return ans;
    }

    // In-Order Traversal
    public static void inOrder(Node2 root, Node2 subRoot) {
        if (root != null) {
            inOrder(root.left, subRoot); // left;
            boolean ans1 = match(root, subRoot);
            if (ans1) {
                ans = true;
            }
            inOrder(root.right, subRoot);
        }
    }

    // Match the subtree in the tree
    public static boolean match(Node2 root, Node2 subroot) {
        // step 1) both not null
        if (root != null && subroot != null) {
            // step 2 then we check the values
            boolean a = match(root.left, subroot.left);
            boolean b = match(root.right, subroot.right);

            if ((root.data == subroot.data) && a && b) {
                return true;
            } else
                return false;

        }
        // step 3) both null
        else if (root == null && root == null)
            return true;
        else
            // step 4) one null and one not null
            return false;

    }

}

class Node2 {
    int data;
    Node2 left;
    Node2 right;

    Node2(int data) {
        this.data = data;
    }

    Node2(int data, Node2 left, Node2 right) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
