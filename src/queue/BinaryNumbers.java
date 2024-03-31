package src.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author giraykaleli
 *
 * We try to represent binary numbers by using queue
 */
public class BinaryNumbers {

    public static void main(String[] args) {

        int size = 5;

        String[] result = new String[size];

        Queue<String> que = new LinkedList<>();

        que.offer("1"); // firstly, we should start the queue from 1, and then we will add others to produce binary

        for (int i=0; i<size; i++){

            result[i] = que.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";

            // with offer() method, we add the string n1 & n2 to the queue
            que.offer(n1);
            que.offer(n2);

        }

        for (String str: result) {
            System.out.print(str + " ---> ");

        }

        String binary = "";
        for (String str: result) {

            binary = binary + str;
        }

        System.out.println("\n**** Binary Representation **** ");
        System.out.println(binary);

    }

}
