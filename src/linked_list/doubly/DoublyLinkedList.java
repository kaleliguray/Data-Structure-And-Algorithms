package src.linked_list.doubly;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;



    private class ListNode {

        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){

        return length == 0; // head == null
    }

    public int length() {
        return length;
    }

    /**
     * method for displaying elements in a forward and a previous way
     */
    public void display_forward(){

        if (head == null){
            System.out.println("List is empty!");
            return;
        }

        ListNode temp = head;

        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void display_previous(){

        if (tail == null){
            System.out.println("List is empty");
            return;
        }

        ListNode temp = tail;

        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
        }

    /**
     * Insert a value at the end of the linked list
      */
    public void insert_end(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode ;
        }

        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    /**
     * Insert a value at the beginning of the linked list
     */
    public void insert_beginning(int value){

        ListNode newNode = new ListNode(value);

        if (isEmpty()){
            tail = newNode;
        }else {
            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    /**
     * delete the list's elements starting from the beginning of it
     */
    public ListNode delete_beginning(){

        if (isEmpty()){
            throw new NoSuchElementException();
        }

        ListNode temporary = head;

        if (head == tail){
            tail = null;
        } else {
            head.next.previous = null;
        }

        head = head.next;
        temporary.next = null;
        length--;

        return temporary;
    }

    /**
     * start to deleting the last element of the list from the end of it
     */
    public ListNode delete_ending(){

        if (isEmpty()){
            throw new NoSuchElementException();
        }

        ListNode temporary = tail;

        if (head == tail){
            head = null;
        }else {
            tail.previous.next = null;
        }

        tail = tail.previous;
        temporary.previous = null;

        return temporary;
    }
































}
