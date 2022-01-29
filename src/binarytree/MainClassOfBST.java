package binarytree;

public class MainClassOfBST extends BinarySearchTree {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(1);
        bst.inOrder(bst.getRoot());
    }
}
