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

        TreeNode first = new TreeNode(1);
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



}
