package src.queue;

/**
 * @author giraykaleli
 *
 * In this class, we try to demonstrate how a queue consist of
 */
public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){

        ListNode temp = new ListNode(data);

        if (isEmpty()){
            front = rear;
        } else {
            rear.next = temp;
        }

        rear = temp;
        length++;
    }








    public static void main(String[] args) {

    }
















}
