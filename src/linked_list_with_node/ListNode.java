package src.linked_list_with_node;

/**
 * In this class, we will create a list nodes
 * and two variables to indicate the data and the next node
 *
 */

public class ListNode {

    protected ListNode head;
    protected int data;
    protected ListNode next;

    public ListNode() {
    }

    public ListNode(int data){
        this.data = data;
        this.next = null;
        this.head = null;
    }

    // This method returns every element in the list and print
    public void display(ListNode node){

        ListNode current = node.head;

        while (current != null){    // checking list is empty or are we at the end of the list

            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }

    // This method gives us the length of the linked list or how many elements the linked list includes
    public int lenght(ListNode node){

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
    }

    //This method adds a new element to the beginning of the linked list
    public void add_beginning(int value){
        ListNode new_node = new ListNode(value);
        new_node.next = this.head;
        this.head = new_node;
    }

    //This method adds a new element to the end of the linked list
    public void add_end(int value){

        ListNode new_node = new ListNode(value);

        if (this.head == null){
            this.head = new_node;
            return;
        }

        ListNode current = this.head;

        while ( current.next !=  null){

            current = current.next;
        }
        current.next = new_node;

    }

    //This method adds a new element to the linked list where given a specific position
    public void insert(int position, int value){

        ListNode new_node = new ListNode(value);

        if (position == 1){ // this means we want to add the value beginning of the list

            new_node.next = head;
            head = new_node;

        }else {     // here we want to add the value at the end or at the position given

            ListNode previous = head;
            int count = 1;  // it counts until reaching the position

            while (count < position-1){

                previous = previous.next;
                count++;

            }

            ListNode current = previous.next;
            previous.next = new_node;
            new_node.next = current;

        }














    }

    //This method delete the first element from the linked list
    public ListNode delete(){

        if(head == null){
            return null;
        }

        ListNode temporary = head;
        head = head.next;
        temporary.next = null;

        return temporary;
    }















}
