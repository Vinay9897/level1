package binarytree;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (isEmpty()) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (data <= temp.getData()) {
                    temp = temp.getLeftNode();
                } else {
                    temp = temp.getRightNode();
                }
            }
            if (data <= parent.getData()) {
                parent.setLefttNode(node);
            } else {
                parent.setRightNode(node);
            }

        }
    }

    private boolean isEmpty() {
        return false;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void inOrder(Object root2) {
    }

}
