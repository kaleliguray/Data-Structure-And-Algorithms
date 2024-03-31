package src.binary_tree;

/**
 * @author giraykaleli
 */

public class BinaryTree {

    private TreeNode root;

    private class TreeNode{

        private int data; // It could be Generic, but I choose integer as for now
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree(){

        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth =  new TreeNode(5);

        root = first; // root ---> first
        first.left = second; // second <--- first --->
        first.right = third; // second <--- first ---> third

        second.left = forth; // forth <--- second --->
        second.right = fifth; // forth <--- second ---> fifth

    }

    // traveling amongst the nodes from left to right
    public void preOrder(TreeNode root){

        if (root == null){
            return;
        }

        System.out.print(root.data + " ");
//        System.out.println("left ---> ");
        preOrder(root.left);
//        System.out.println("right ---> ");
        preOrder(root.right);

    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.createBinaryTree();

        tree.preOrder(tree.root);


    }









}
