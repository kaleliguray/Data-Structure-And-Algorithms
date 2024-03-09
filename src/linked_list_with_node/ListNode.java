package src.linked_list_with_node;

/**
 * In this class, we will create a list nodes
 * and two variables to indicate the data and the next node
 *
 */

public class ListNode {

    protected ListNode head;
    protected int data;
    protected ListNode next;

    public ListNode() {
    }

    public ListNode(int data){
        this.data = data;
        this.next = null;
        this.head = null;
    }

    // This method returns every element in the list and print
    public void display(ListNode node){

        ListNode current = node.head;

        while (current != null){    // checking list is empty or are we at the end of the list

            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }

    // This method gives us the length of the linked list or how many elements the linked list includes
    public int lenght(ListNode node){

        int count = 0;
        ListNode current = node.head;

        if (current.head == null){
            System.out.println("List lenght : " + count);
        }

        while (current != null){
            count++;
            current = current.next;
        }

        return count;
    }

    //This method adds a new element to the beginning of the linked list
    public void add(int value){
        ListNode new_node = new ListNode(value);
        new_node.next = this.head;
        this.head = new_node;
    }

}
