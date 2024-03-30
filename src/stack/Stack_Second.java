package src.stack;

import java.util.EmptyStackException;

/**
 * @author giraykaleli
 *
 * used an array to handle all stack methods and transactions
 */
public class Stack_Second {

    private int top;
    private int[] arr;


    public Stack_Second(int capacity) {
        this.top = -1;
        this.arr = new int[capacity];
    }

    public void push(int data){
        if (isFull()){
            throw new RuntimeException("Stack is full!!");
        }

        top++;
        arr[top] = data;
    }

    public boolean isFull(){
        return arr.length == size();
    }

    public int size(){
        return top + 1; // because array start from 0(zero) to counting
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty!!");
        }

        int result = arr[top];
        top--;
        return result;
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty!!");
        }

        return arr[top];
    }

    public void display(Stack_Second second){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        int length = size();
        int[] temp = new int[length];
        for (int i=0; i<length; i++){
            temp[i] = second.peek();
            second.pop();
            System.out.print(temp[i] + " ---> ");
        }

        for (int i = temp.length-1; i>=0; i--){
            second.push(temp[i]);
        }
        System.out.println("null");

    }

    public static void main(String[] args) {


        Stack_Second second = new Stack_Second(5);

        second.push(1);
        second.display(second);

        second.push(2);
        second.display(second);

        second.push(3);
        second.display(second);

        second.push(4);
        second.push(5);

        System.out.println("****************************");

        second.display(second);

        System.out.println(second.peek());
        second.pop();
        second.display(second);

        System.out.println(second.peek());
        second.pop();
        second.display(second);

        System.out.println(second.peek());
        second.pop();
        second.display(second);

        System.out.println(second.peek());
        second.pop();
        second.display(second);

    }




}
