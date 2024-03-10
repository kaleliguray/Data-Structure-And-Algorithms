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
        current.display(current);
        System.out.println("\nThis is the method shows the length of the list: "+ current.lenght(current));

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
        end_node.add_end(7);
        end_node.display(end_node);

        System.out.println("\n**********************************************\n");
        System.out.println("This method inserts a value to a given position in the linked list");

        ListNode insert_node = new ListNode();
        insert_node.add_beginning(23);
        insert_node.add_beginning(8);
        insert_node.add_beginning(1);
        insert_node.add_beginning(10);

        insert_node.display(insert_node);

        insert_node.insert(3, 5);
        insert_node.display(insert_node);

        insert_node.insert(1, 2);
        insert_node.display(insert_node);


        insert_node.insert(7, 7);
        insert_node.display(insert_node);

        System.out.println("\nThe length of the list: "+ insert_node.lenght(insert_node));






    }


}
