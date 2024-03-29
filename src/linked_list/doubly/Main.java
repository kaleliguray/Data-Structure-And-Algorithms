package src.linked_list.doubly;

public class Main {

    public static void main(String[] args) {

        //Printing values in the linked List

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














    }



}
