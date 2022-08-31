package binarytree;

public class BinarySearchTree {

    private TreeNode root;

    public void inOrder(TreeNode node) {
        if (node != null) {
            // process left sub tree
            inOrder(node.getLeftNode());
            // // process root
            System.out.print(node.getData() + ", ");
            // // process right sub tree
            System.out.println(node.getRightNode());
        }
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            // // process left sub tree
            System.out.print(node.getData() + ", ");
            // // process root
            inOrder(node.getLeftNode());
            // // process right sub tree
            System.out.println(node.getRightNode());
        }
    }

    // private boolean isEmpty( TreeNode root) {
    // return root == null;
    // }

    public TreeNode getRoot() {
        return root;
    }
}
