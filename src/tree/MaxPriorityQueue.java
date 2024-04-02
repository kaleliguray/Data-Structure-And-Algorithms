package src.tree;

/**
 * @author giraykaleli
 *
 * In here, we will demonstrate how the max priority queue looks like
 * And how they are using array
 */

public class MaxPriorityQueue {

    private Integer[] heap; // could be generic type
    private int n; // size of max heap

    public MaxPriorityQueue(int capacity) {
        this.heap = new Integer[capacity + 1]; // capacity + 1 --> because first index (0) of array is kept as empty
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public static void main(String[] args) {

        MaxPriorityQueue mqp = new MaxPriorityQueue(3);
        System.out.println(mqp.isEmpty());
        System.out.println(mqp.size());


    }

}
