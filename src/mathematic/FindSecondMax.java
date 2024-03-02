package src.mathematic;

public class FindSecondMax {

    public static void printArray(int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * We try to find the Second Maximum Value in the array among other values
     * Step by step;
     * 1. create two variable to keep our 1.max and 2.max value
     * 2. initialize them with the lowest amount
     * 3. create a for loop to go through among the array variable
     * 4. using if condition to check max amount and array's variable
     * 5. assing 1 max amount to our max variable
     * 6. using 2. if condition to check 2.max variable
     * 7. return second max variable
     * @param arr
     * @return
     */

    public static int findSecondMaxValue(int[] arr){
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > first_max){
                second_max = first_max;
                first_max = arr[i];
            } else if (arr[i] > second_max && second_max != first_max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }


    public static void main(String[] args) {

        int[] example_array = {1, 34, 33, 2, 44, 10, 62, 17, 24, 8};

        printArray(example_array);

        int second_max_value = findSecondMaxValue(example_array);

        System.out.println("Secon Max Value: " + second_max_value);

    }




}
