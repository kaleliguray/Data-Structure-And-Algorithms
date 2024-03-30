package src.stack;

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






}
