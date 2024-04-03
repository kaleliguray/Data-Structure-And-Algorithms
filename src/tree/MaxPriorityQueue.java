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

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];

        for (int i = 0; i< heap.length; i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void insert(int x){
        if (n == heap.length - 1){
            resize(heap.length*2);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k){

        while ( k > 1 && heap[k/2] < heap[k]){

            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2; // because we need to shift up till new value inserted is at a correct postion
        }

    }

    public void print_max_heap(){
        // we start to count i from 1 because zero index is empty
        for (int i=1; i<=n; i++){
            System.out.print(heap[i] + " -> ");
        }
    }







    public static void main(String[] args) {

        MaxPriorityQueue mqp = new MaxPriorityQueue(3);
        System.out.println(mqp.isEmpty());
        System.out.println(mqp.size());

        mqp.insert(4);
        mqp.insert(5);
        mqp.insert(2);
        mqp.insert(6);
        mqp.insert(1);
        mqp.insert(3);

        System.out.println(mqp.size());
        mqp.print_max_heap();


    }

}
