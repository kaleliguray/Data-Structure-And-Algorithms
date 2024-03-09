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


   /* // This method gives us the length of the linked list or how many elements the linked list includes
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
    }*/



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
        node_1.display(node_1.head);

        ListNode current = node_1.head;

        System.out.println("\n**********************************************");

        System.out.println("\nThis is the method for printing the values");
        current.display(current);

        System.out.println("\n**********************************************");

        // Also we can learn the length of list with this method
        System.out.println("\nThis is the method shows the length of the list: "+ current.lenght(node_1.head));

        System.out.println("\n**********************************************\n");
        System.out.println("This method add a value to the beginning of the linked list");
        ListNode new_node = new ListNode();
        new_node.add_beginning(23);
        new_node.add_beginning(8);
        new_node.add_beginning(1);
        new_node.add_beginning(10);
        new_node.display(new_node);

        System.out.println("\n**********************************************\n");
        System.out.println("This method add a value to the end of the linked list");
        ListNode end_node = new ListNode();
        end_node.add_end(23);
        end_node.add_end(8);
        end_node.add_end(1);
        end_node.add_end(10);
        end_node.display(end_node);


    }


}
