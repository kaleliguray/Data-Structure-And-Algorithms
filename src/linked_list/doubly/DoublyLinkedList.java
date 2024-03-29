package src.linked_list.doubly;

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
     * Insert method adds a value to the List
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


























}
