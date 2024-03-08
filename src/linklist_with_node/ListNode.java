package src.linklist_with_node;

/**
 * In this class, we will create a list nodes
 * and two variables to indicate the data and the next node
 *
 */

public class ListNode {

    protected ListNode head;
    protected int data;
    protected ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
        this.head = null;
    }

}
