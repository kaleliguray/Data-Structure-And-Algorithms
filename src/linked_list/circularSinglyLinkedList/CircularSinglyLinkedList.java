package src.linked_list.circularSinglyLinkedList;


import java.util.NoSuchElementException;

/**
 * @author giraykaleli
 * @return the loop consists of the singly linked list
 */

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode{

        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        this.last = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    // This method creates a loop in the list of elements from the end to the beginning
    public void createCircularSinglyLinkedList(){

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(9);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        last = fifth;

    }

    // this method shows the values of the list
    public void display(ListNode node){

        if (last == null){
            System.out.println("List is empty");
            return;
        }

        ListNode first = last.next;

        while (first != last){  // while (first != null) ---> show us the values of the list but in a loop
            System.out.print(first.data + " --> ");
            first = first.next;
        }

        System.out.println(first.data + " ");
    }

    // this method insert node at the start of the circulation singly linked list
    public void insert_beginning(int value){

        ListNode temporary = new ListNode(value);

        if (last == null){

            last = temporary;

        }else {

            temporary.next = last.next;

        }

        last.next = temporary;
        length++;
    }

    // this method insert node at the end of the circulation singly linked list
    public void insert_end(int value){

        ListNode temporary = new ListNode(value);

        if (last == null){
            last = temporary;
            last.next = last;
        } else {
            temporary.next = last.next;
            last.next = temporary;
            last = temporary;
        }
        length++;
    }

    // this method delete node at the beginning of the circulation singly linked list
    public int delete_first(){

        if (isEmpty()){
            throw new NoSuchElementException();
        }

        ListNode temp = last.next;
        int result = temp.data;
        if (last == last.next){
            last = null;
        }else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return result;
    }



    public static void main(String[] args) {

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        System.out.println("**********************************************");
        System.out.println("the loop consists of the singly linked list\n");
        csll.createCircularSinglyLinkedList();
        csll.display(csll.last);

        System.out.println("\n**********************************************");
        System.out.println("this method shows the values of the list\n");
        csll.display(csll.last);

        System.out.println("**********************************************");
        System.out.println("this method insert node at the start of the circulation singly linked list\n");
        csll.display(csll.last);
        csll.insert_beginning(11);
        csll.display(csll.last);
        csll.insert_beginning(13);
        csll.display(csll.last);
        csll.insert_beginning(15);
        csll.display(csll.last);

        System.out.println("**********************************************");
        System.out.println("this method insert node at the end of the circulation singly linked list\n");
        csll.display(csll.last);
        csll.insert_end(17);
        csll.display(csll.last);
        csll.insert_end(19);
        csll.display(csll.last);
        csll.insert_end(21);
        csll.display(csll.last);

        System.out.println("**********************************************");
        System.out.println("this method delete node at the beginning of the circulation singly linked list\n");
        csll.display(csll.last);

        csll.delete_first();
        csll.display(csll.last);
        System.out.println(csll.delete_first());
        csll.display(csll.last);
        System.out.println(csll.delete_first());
        csll.display(csll.last);


    }













}
