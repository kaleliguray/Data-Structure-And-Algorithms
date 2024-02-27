package src.mathematic;

public class RemoveEvenIntegers {

    public static void printArray(int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeEvenIntegers(int[] arr){

        int odd_number = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                odd_number++;
            }
        }

        int[] odd_array = new int[odd_number];
        int odd_index = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                odd_array[odd_index] = arr[i];
                odd_index++;
            }
        }

        return odd_array;
    }

    public static void main(String[] args) {

        int[] example_array = {3, 2, 4, 7, 10, 8, 5, 9};

        printArray(example_array);

        int[] odd_array = removeEvenIntegers(example_array);

        printArray(odd_array);

    }

}
