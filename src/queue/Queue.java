package src.queue;

import java.util.NoSuchElementException;

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

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    // this method add a new data inside to the queue
    public void enqueue(int value){

        ListNode temp = new ListNode(value);

        if (isEmpty()){
            front = temp;
        } else {
            rear.next = temp;
        }

        rear = temp;
        length++;
    }

    // this method gives us every element which is in the queue
    public void print(){

        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        ListNode current = front;

        while (current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // this method remove an element from the queue
    public int dequeue(){

        if (isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }

        int result = front.data;
        front = front.next;

        if (front == null){
            rear = front;
        }

        length--;

        return result;
    }

    // these methods which are located under this comment, give us the first and the last element in the queue
    public int first(){
        if (isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }
        return front.data;
    }

    public int last(){
        if (isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }
        return rear.data;
    }








    public static void main(String[] args) {

        Queue example = new Queue();

        System.out.println("************ Enqueue Method *************");
        example.enqueue(1);
        example.print();
        example.enqueue(5);
        example.print();
        example.enqueue(10);
        example.print();
        example.enqueue(15);
        example.print();

        System.out.println("******* First & Last Element in the Queue ******************");

        System.out.println("First: " + example.first());
        System.out.println("Last: " + example.last());

        System.out.println("************ Dequeu Method *************");

        example.dequeue();
        example.print();
        example.dequeue();
        example.print();

        System.out.println("******* After Dequeue Method, First & Last Element in the Queue ******************");

        System.out.println("First: " + example.first());
        System.out.println("Last: " + example.last());

        System.out.println("Removing every element in the Queue");

        example.print();
        example.dequeue();
        example.print();
        example.dequeue();
        example.print();









    }

}
