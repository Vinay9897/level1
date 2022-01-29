package binarytree;

public class BinarySearchTree {

    private TreeNode root;

    // public void insert(int data) {
    // TreeNode node = new TreeNode(data);
    // if (isEmpty()) {
    // root = node;
    // } else {
    // TreeNode temp = root;
    // TreeNode parent = null;
    // while (temp != null) {
    // parent = temp;
    // if (data <= temp.getData()) {
    // temp = temp.getLeftNode();
    // } else {
    // temp = temp.getRightNode();
    // }
    // }
    // if (data <= parent.getData()) {
    // parent.setLeftNode(node);
    // } else {
    // parent.setRightNode(node);
    // }

    // }
    // }

    // public TreeNode insert(TreeNode root, int value) {
    // TreeNode temp = root;
    // if (root == null) {
    // root = new TreeNode(value);
    // }
    // if (value < temp.getData()) {
    // temp.getLeftNode() = insert(temp.getLeftNode(), value);
    // }
    // return root;
    // }

    public void inOrder(TreeNode node) {
        if (node != null) {
            // process left sub tree
            inOrder(node.getLeftNode());
            // process root
            System.out.print(node.getData() + ", ");
            // process right sub tree
            System.out.println(node.getRightNode());
        }
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            // process left sub tree
            System.out.print(node.getData() + ", ");
            // process root
            inOrder(node.getLeftNode());
            // process right sub tree
            System.out.println(node.getRightNode());
        }
    }

    private boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public TreeNode getRoot() {
        return root;
    }
}
