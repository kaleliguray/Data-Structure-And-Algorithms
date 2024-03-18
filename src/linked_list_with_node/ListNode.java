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

        if (node.head == null) {
            System.out.println("List is empty");
            return;
        }

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

    //This method adds a new element from the linked list where given a specific position
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

    //This method delete the last element from the linked list
    public ListNode delete_last(){

        if (head == null || head.next == null){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null){

            previous = current;
            current = current.next;

        }

        previous.next = null;
        return current;
    }

    //This method delete an element from the linked list where given a specific position
    public void delete_position(int position){

        if (position == 1){
            head = head.next;
        }else {

            ListNode previous = head;
            int count = 1;

            while (count < position - 1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }




    }

    //This method find an element from the linked list where given a specific position
    public boolean find_element (int search_key, ListNode head){

        if (head == null){
            System.out.println("List is empty");
            return false;
        }

        ListNode current = head;
        int position = 0;

        while (current != null){

            position++;
            if (current.data == search_key){
                System.out.println(search_key + " element is at the " + position + " position");
                return true;
            }

            current = current.next;
        }
        System.out.println(search_key + " element is not in the list");
        return false;
    }

    //This method reverses elements in the linked list
    public ListNode reverse(ListNode node){

        if (node.head == null){
            return node.head;
        }

        ListNode current = node.head;
        ListNode previous = null;
        ListNode next = null;
        ListNode reverse = new ListNode();

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            reverse.add_beginning(previous.data);
        }

        return reverse;
    }

    //This method gets an element that is given a position at the end of the list
    public ListNode get_end_element(int position){

        if (head == null){
            return null;
        }

        if (position < 0){
            throw new IllegalArgumentException("Invalid position: "+position);
        }

        ListNode mainPointer = head;
        ListNode referencePointer = head;
        int count = 0;

        while (count < position){
            referencePointer = referencePointer.next;
            count++;
        }

        while (referencePointer != null){
            referencePointer = referencePointer.next;
            mainPointer = mainPointer.next;
        }

        return mainPointer;
    }

    //This method sorts the duplicate elements out and omits one of them from the list
    public void dublicate_element(){

        if (head == null){
            System.out.println("List is empty");
            return;
        }

        ListNode current = head;

        while (current != null && current.next != null){

            if (current.data == current.next.data){
                current.next = current.next.next;
            }else {
                current = current.next;
            }

        }



    }

    //This method inserts an element in the sorted list
    public ListNode insert_element_toSortList(int value){

        ListNode new_node = new ListNode(value);

        if (head == null){
            return new_node;
        }

        ListNode current = head;
        ListNode temporary = null;

        while (current != null && current.data < new_node.data){
            temporary = current;
            current = current.next;
        }

        new_node.next = current;
        temporary.next = new_node;

        return head;
    }

    //This method deletes an element that is given from the list
    public void delete_node(int key){

        ListNode current = head;
        ListNode temporary = null;

        // If we found the given value at the beginning of the list and delete
        if (current == null && current.data == key){
            System.out.println("The value is deleted from the list, and it was detected at the beginning of the list");
            head = current.next;
            return;
        }

        while (current != null && current.data != key){
            temporary = current;
            current = current.next;
        }

        //If we did not find the given value in the list
        if (current == null){
            System.out.println("The given value is not in the list");
            return;
        }

        temporary.next = current.next;

    }

    //This method shows whether the list includes a loop or not
    public boolean contains_loop(){

        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode != null && fastNode.next != null){

            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if (fastNode == slowNode){
                System.out.println("There is a loop in the list");
                return true;
            }

        }
        System.out.println("There is no loop in the list");
        return false;
    }

   /* public void creat_loop_node(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = forth; // we will turn back here after sixth
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third; // here is the loop beginning point, we get back to third node again

        System.out.print(first.data + "\t");
        System.out.print(second.data + "\t");
        System.out.print(third.data + "\t");
        System.out.print(forth.data + "\t");
        System.out.print(fifth.data + "\t");
        System.out.print(sixth.data + "\t");
        System.out.print(sixth.next.data + "\t");
        System.out.print(third.next.data + "\t");
        System.out.print(forth.next.data + "\t");
        System.out.print(fifth.next.data + "\n");

    }*/

    /**
     * Floyd's Cycle Detection Algorithms
     * It detects whether there is a loop in the link list or not
     * And then return a value where the loop starts
     */

    public int floyd_cycle_detection(){
        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode != null && fastNode.next != null){

            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if (fastNode == slowNode){

                return getStartingNode(slowNode);
            }

        }

        return 0;
        }
    public int getStartingNode(ListNode slowNode){

        ListNode temp = head;
        int starting_node_value = 0;
        while (temp != slowNode){

            temp = temp.next;
            slowNode = slowNode.next;
            starting_node_value = temp.data;
        }

        return starting_node_value; // starting node of the loop
    }









}
































