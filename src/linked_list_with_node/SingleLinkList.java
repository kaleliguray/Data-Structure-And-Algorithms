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

        System.out.println("**********************************************\n");
        System.out.println("This method deletes the first value in the linked list");

        ListNode delete_item = new ListNode();
        delete_item.add_beginning(23);
        delete_item.add_beginning(8);
        delete_item.add_beginning(1);
        delete_item.add_beginning(10);

        delete_item.display(delete_item);
        System.out.println("Deleted item: " + delete_item.delete().data);
        delete_item.display(delete_item);
        System.out.println("Deleted item: " + delete_item.delete().data);
        delete_item.display(delete_item);
        System.out.println("Deleted item: " + delete_item.delete().data);
        delete_item.display(delete_item);
        System.out.println("Deleted item: " + delete_item.delete().data);
        delete_item.display(delete_item);

        System.out.println("**********************************************\n");
        System.out.println("This method deletes the last value in the linked list");

        ListNode last_item = new ListNode();
        last_item.add_beginning(23);
        last_item.add_beginning(8);
        last_item.add_beginning(1);
        last_item.add_beginning(10);

        last_item.display(last_item);

        last_item.delete_last();
        last_item.display(last_item);
        last_item.delete_last();
        last_item.display(last_item);
        last_item.delete_last();
        last_item.display(last_item);

        System.out.println("**********************************************\n");
        System.out.println("This method delete an element from the linked list where given a specific position");

        ListNode example = new ListNode();
        example.add_beginning(23);
        example.add_beginning(8);
        example.add_beginning(1);
        example.add_beginning(10);

        example.display(example);

        example.delete_position(1);
        example.display(example);
        example.delete_position(2);
        example.display(example);

        System.out.println("**********************************************\n");
        System.out.println("This method find an element from the linked list where given a specific position");

        ListNode simple = new ListNode();
        simple.add_beginning(23);
        simple.add_beginning(8);
        simple.add_beginning(1);
        simple.add_beginning(10);

        simple.display(simple);

        simple.find_element(8, simple.head);
        simple.find_element(23, simple.head);
        simple.find_element(10, simple.head);
        simple.find_element(1, simple.head);

        System.out.println("**********************************************\n");
        System.out.println("This method reverses elements in the linked list");

        ListNode reverse_example = new ListNode();
        reverse_example.add_end(23);
        reverse_example.add_end(8);
        reverse_example.add_end(1);
        reverse_example.add_end(10);

        reverse_example.display(reverse_example);

        ListNode a = reverse_example.reverse(reverse_example);

        a.display(a);
    }


}
