package src.tree;

import java.util.Stack;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class SymmetricTree {

    private BinaryTree root;

    private class TreeNode{

        private int data; // It could be Generic, but I choose integer as for now
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public boolean isSymmetric(TreeNode root){
        if (root == null){
            return true;
        }
        Stack<TreeNode> stack =  new Stack<>();
        stack.push(root.right);
        stack.push(root.left);

        while (!stack.isEmpty()){
            TreeNode node1 = stack.pop();
            TreeNode node2 = stack.pop();

            if (node1 == null && node2 == null){
                continue;
            }
            if (node1 == null || node2 == null || node1.data != node2.data){
                return false;
            }

            stack.push(node1.left);
            stack.push(node2.right);
            stack.push(node1.right);
            stack.push(node2.left);
        }

        return true;
    }

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();
        // Creating a symmetric binary tree
        TreeNode root = symmetricTree.new TreeNode(1);
        root.left = symmetricTree.new TreeNode(2);
        root.right = symmetricTree.new TreeNode(2);
        root.left.left = symmetricTree.new TreeNode(3);
        root.left.right = symmetricTree.new TreeNode(4);
        root.right.left = symmetricTree.new TreeNode(4);
        root.right.right = symmetricTree.new TreeNode(3);

        // Checking if the tree is symmetric
        boolean isSymmetric = symmetricTree.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + isSymmetric);
    }
}
