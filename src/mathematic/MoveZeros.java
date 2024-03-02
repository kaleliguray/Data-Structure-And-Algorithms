package src.mathematic;

public class MoveZeros {

    public static void printArray(int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    /**
     * In this example, we will find 0 element in the array, and then move them to end of the array
     * step by step
     * 1. create a valuable to keep 0 value from the array
     * 2. with for loop to go through among the array variable
     * 3. by using 1.if condition to compare amounts of array with zero-0
     * 4. using 2. If condition to control our value following the zero value in the array
     * whether it is equal to zero or not and then increment it to 1
     * 5.return array valuables
     * @param arr
     */

    public static void moveZeros(int[] arr){

        int zero_follow = 0;

        for (int i=0; i<arr.length; i++){

            if(arr[i] != 0 && arr[zero_follow] == 0){
                int temp = arr[i];
                arr[i] = arr[zero_follow];
                arr[zero_follow] = temp;
            }
            if (arr[zero_follow] != 0){
                zero_follow++;
            }
        }

    }

    public static void main(String[] args) {

        int[] example_array = {3, 5, 0, 7, 1, 0, 2, 0, 9, 4, 6};

        printArray(example_array);

        moveZeros(example_array);

        printArray(example_array);

    }


}
