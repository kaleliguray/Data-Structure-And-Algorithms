package src.linked_list_with_node;

/**
 * In this class, we will get instances from our listNode class
 *
 * 1. then assign data to them
 * 2. next link them to each other
 *
 * this exercise shows us how a linked list works
 */

public class SingleLinkList {

    public static void display(ListNode node){

        ListNode current = node.head;

        while (current != null){

            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public static int lenght(ListNode node){

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

    public static void main(String[] args) {

        ListNode node_1 = new ListNode(10);
        ListNode node_2 = new ListNode(1);
        ListNode node_3 = new ListNode(8);
        ListNode node_4 = new ListNode(23);

        // we connect the nodes with each other such like chain

        node_1.head = node_1; // 10
        node_1.next = node_2; // 10 --> 1
        node_2.next = node_3; // 10 --> 1 --> 8
        node_3.next = node_4; // 10 --> 1 --> 8 --> 23 --> null & node_4.next --> null (end of the linkedlist)

        // Now!!! printing these value

        ListNode current = node_1.head;

        while (current != null){ // checking list is empty or are we at the end of the list

            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

        System.out.println("\nThis is the method for printing the values");
        display(node_1.head);

        System.out.println();

        // here, we will get the length of the node
        int count = 0;
        current = node_1.head;  // we should locate the current node at the beginning again

        if (current.head == null){
            System.out.println("List lenght : " + count);
        }

        while (current != null){
                count++;
                current = current.next;
            }
        System.out.print("List  length: " + count);

        // Also we can learn the length of list with this method
        System.out.println("\nThis is the method shows the length of the list: "+ lenght(node_1.head));
//      System.out.println("\nList of length: " + lenght(node_1.head));

    }


}
