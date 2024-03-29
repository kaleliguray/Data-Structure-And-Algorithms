package src.linked_list.doubly;

public class Main {

    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("Printing values in the linked List & Insert a value at the end of the linked list\n");

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert_end(1);
        dll.insert_end(10);
        dll.insert_end(15);
        dll.insert_end(25);

        dll.display_forward();
        dll.display_previous();

        System.out.println("\n**********************************************");
        System.out.println("Insert a value at the beginning of the linked list\n");

        DoublyLinkedList beginning = new DoublyLinkedList();

        beginning.insert_beginning(8);
        beginning.insert_beginning(7);
        beginning.insert_beginning(6);
        beginning.insert_beginning(5);

        beginning.display_forward();

        System.out.println("\n**********************************************");
        System.out.println("Delete the list's elements starting from the beginning of it\n");

        DoublyLinkedList delete_first_element = new DoublyLinkedList();

        delete_first_element = beginning; // we assign the previous list's value to our delete_first_element list

        delete_first_element.display_forward();

        delete_first_element.delete_beginning();
        delete_first_element.display_forward();
        delete_first_element.delete_beginning();
        delete_first_element.display_forward();
        delete_first_element.delete_beginning();
        delete_first_element.display_forward();












    }



}
