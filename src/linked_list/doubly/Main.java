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

        System.out.println("\n**********************************************");
        System.out.println("Start to deleting the last element of the list from the end of it\n");

        DoublyLinkedList delete_end = new DoublyLinkedList();

        delete_end = dll; // we assign the previous list's value to our new list

        delete_end.display_forward();

        delete_end.delete_ending();
        delete_end.display_forward();
        delete_end.delete_ending();
        delete_end.display_forward();
        delete_end.delete_ending();
        delete_end.display_forward();




    }



}
