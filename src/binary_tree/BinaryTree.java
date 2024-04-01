package src.binary_tree;

import java.util.Stack;

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

    // traveling among the nodes from left to right
    // and also, this method is recursive, calling itself
    public void preOrderRecursive(TreeNode root){

        if (root == null){
            return;
        }

        System.out.print(root.data + " ");
//        System.out.println("left ---> ");
        preOrderRecursive(root.left);
//        System.out.println("right ---> ");
        preOrderRecursive(root.right);
    }

    // Without recursive method, we try to preOrder the tree
    public void preOrder(TreeNode root){

        if (root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode temporary = stack.pop();
            System.out.println(temporary.data + " ");

            if (temporary.right != null){
                stack.push(temporary.right);
            }
            if (temporary.left != null){
                stack.push(temporary.left);
            }

        }
    }

    // This method travels through the tree by starting from the left branch to the right one
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }














    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.createBinaryTree();

        System.out.println("**** preOrder - with recursive method ****");
        tree.preOrderRecursive(tree.root);
        System.out.println("\n**** preOrder - by using stack and while ****");
        tree.preOrderRecursive(tree.root);
        System.out.println("\n**** inOrder - Binary Tree - by using stack and while ****");
        tree.inOrder(tree.root);

    }









}
