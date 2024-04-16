package src.mathematic;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class FindProduct {

    public static int[] find_product(int[] arr){
        int temp = 1;
        int[] result = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            result[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;

        for (int i= arr.length-1; i>=0; i--){
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // Add a comma and space after each element, except for the last one
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Print a newline after printing all elements
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int[] result = find_product(arr);

        printArray(result);


    }
}
