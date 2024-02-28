package src.mathematic;

public class FindMinNumber {

    public static void print(int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int minValue(int[] arr){

        int min_value = arr[0]; // we keep first element of the array to compare others

        // try-catch is for check the array condition
        try {

            if ( arr.length == 0 || arr == null) {
                throw new IllegalArgumentException();
            }else {

                for (int i=1; i<arr.length; i++){ // we start for loop from the 1. element of array

                    if (arr[i] < min_value){
                        min_value = arr[i]; // we check which number is minimum and then assign it
                    }

                }
            }

        }catch (IllegalArgumentException e){
            System.out.println("Array is null or Array does not include any element");
        }

        return min_value;
    }

    public static void main(String[] args) {

        int[] example_array = {3, 5, 7, 8, 2, 9, 6, 1};

        print(example_array);

        System.out.println(minValue(example_array));




    }





}
