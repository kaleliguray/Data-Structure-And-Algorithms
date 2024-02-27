package src.mathematic;

public class ReverseArray {

    public static void printArray(int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr, int start_index, int end_index){

        while (start_index < end_index){

            int temporary = arr[start_index];
            arr[start_index] = arr[end_index];
            arr[end_index] = temporary;

            start_index++;
            end_index--;

        }

    }

    public static void main(String[] args) {

        int[] example_array = {3, 2, 4, 7, 10, 8, 5};

        printArray(example_array);

        reverse(example_array,0,example_array.length-1);

        printArray(example_array);

    }

}
