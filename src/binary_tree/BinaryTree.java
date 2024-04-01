package src.binary_tree;

import java.util.LinkedList;
import java.util.Queue;
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

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth =  new TreeNode(9);
        TreeNode sixth =  new TreeNode(8);
        TreeNode seventh =  new TreeNode(7);

        root = first; // root ---> first
        first.left = second; // second <--- first --->
        first.right = third; // second <--- first ---> third

        second.left = forth; // forth <--- second --->
        second.right = fifth; // forth <--- second ---> fifth

        third.right = sixth;
        third.left = seventh;

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

    // Likewise inOrder() method but this time we use the Stack and temporary node to travel among the tree's leaf
    public void inOrder_With_Stack(TreeNode root){
        if (root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temporary = root;

        while (temporary != null || !stack.isEmpty()){

            if (temporary != null){
                stack.push(temporary);
                temporary = temporary.left;

            } else {
                temporary = stack.pop();
                System.out.print(temporary.data + " ");
                temporary = temporary.right;

            }

        }

    }

    // This method travels primarily the left side of the tree and then right leafs next visit the node
    public void postOrder(TreeNode root){

        if (root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    // postOrder with Stack and temporary variable ---> it is also called as reversal postOrder
    public void postOrder_with_stack(TreeNode root){

        if (root == null){
            return;
        }

        TreeNode current = root;
        TreeNode temporary;

        Stack<TreeNode> stack = new Stack<>();

        while (current != null || !stack.isEmpty()){

            if (current != null){
                stack.push(current);
                current = current.left;

            } else {

                temporary = stack.peek().right;

                if (temporary == null){
                    temporary = stack.pop();
                    System.out.print(temporary.data + " ");

                    while (!stack.isEmpty() && temporary == stack.peek().right){
                        temporary = stack.pop();
                        System.out.print(temporary.data + " ");

                    }
                } else {

                    current = temporary;
                }

            }


        }


    }

    // travel tree nodes-leaf by using Queue, this method firstly prints parent nodes then leafs
    public void order_with_queue(TreeNode root){

        if (root == null){
            return;
        }

        TreeNode temporary;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()){

            temporary = queue.poll();
            System.out.print(temporary.data + " ");

            if (temporary.left != null){
                queue.offer(temporary.left);
            }
            if (temporary.right != null){
                queue.offer(temporary.right);
            }


        }




    }

    // finding max value in the tree
    public int findMaxValue(TreeNode root){

        if (root == null){
            return 0; // I choose the zero-0 for compare as a min value, however we can use Integer.MIN_VALUE, as well
        }

        int result = root.data;

        int left = findMaxValue(root.left);
        int right = findMaxValue(root.right);

        if (left > result){
            result = left;
        }
        if (right > result){
            result = right;
        }

        return result;
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
        System.out.println("\n**** inOrder with Stack & Temporary - Binary Tree - by using stack and while ****");
        tree.inOrder_With_Stack(tree.root);
        System.out.println("\n**** postOrder method - Binary Tree ****");
        tree.postOrder(tree.root);
        System.out.println("\n**** postOrder method with Stack or reversal postOrder - Binary Tree ****");
        tree.postOrder_with_stack(tree.root);
        System.out.println("\n**** order with Queue - Binary Tree ****");
        tree.order_with_queue(tree.root);
        System.out.println("\n**** find max value - Binary Tree ****");
        int max = tree.findMaxValue(tree.root);
        System.out.println("Max Value : " + max);

    }









}
