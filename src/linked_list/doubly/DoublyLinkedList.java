package src.linked_list.doubly;

public class DoublyLinkedList extends ListNode{

    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList(int data) {
        super(data);
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
    





}
