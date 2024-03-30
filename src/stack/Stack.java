package src.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author giraykaleli
 */

public class Stack {

    private ListNode top;
    private int length;

    public class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    // adding a new value to the stack
    public void push(int value){

        ListNode temp = new ListNode(value);
        temp.next = top;
        top = temp;
        length++;
    }

    // deleting a value from the stack
    public int pop(){

        if (isEmpty()){
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    // getting a value which placed the top of the stack
    public int peek(){

        if (isEmpty()){
            throw new EmptyStackException();
        }

        return top.data;
    }

    // printing the value
    public void displayStack(Stack stack){

        if (isEmpty()){
            throw new EmptyStackException();
        }

        int length = stack.length;
        int[] temp = new int[length];

        for (int i=0; i< length; i++){
            temp[i] = stack.peek();
            stack.pop();
            System.out.print(temp[i] + " ---> ");
        }

        for (int i=0; i< temp.length; i++){
            stack.push(temp[i]);
        }

        System.out.println("null");

    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        stack.displayStack(stack);

        System.out.println(stack.length);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();



    }






















}
