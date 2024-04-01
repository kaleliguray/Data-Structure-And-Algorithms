package src.tree;

/**
 * @author giraykaleli
 */

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode{

        private int data;  // could be Generic Type
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    // inserting a value to the tree with this method
    public void insert(int value){
        root = insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value){

        if (root == null){

            root = new TreeNode(value);
            return root;
        }

        if (value < root.data){
            root.left = insert(root.left, value);

        }else {
            root.right = insert(root.right, value);

        }
        return root;
    }

    // printing the values of the tree
    public void inOrder(TreeNode root){

        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(1);

        binarySearchTree.inOrder(binarySearchTree.root);

    }

}
