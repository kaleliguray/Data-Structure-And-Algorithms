package src.mathematic;

public class ResizeArray {

    /**
     * In this part, we will change an array size and copy to value to new array which has a new size
     *
     * 1. create an array and give some values
     * 2. define resizeArray method with the existing array and new array size (as parameters)
     * 3. create a new array with a new array size which is given in the method signature
     * 4. using for loops to assign old array value to the new array
     * 5. return the new array with the same elements as the old one that has
     */

    // this method is for printing array's elements
    public static void print(int[] arr){

        for (int i=0; i<arr.length; i++){

            System.out.print(arr[i] + "\t");

        }

        System.out.println();
    }

    public static int[] resizeArray(int[] existing_array, int new_array_size){

        int temporary_array[] = new int[new_array_size];

        for (int i=0; i<existing_array.length; i++){

            if (temporary_array.length >= existing_array.length){ // checking new array size

                temporary_array[i] = existing_array[i]; // assing elements to new array
            }
        }

        return temporary_array;
    }


    public static void main(String[] args) {

        int[] example = {1, 3, 5, 9, 11, 13, 15, 17};

        System.out.println("Existing array size: " + example.length);
        System.out.println("Existing array elements:");
        print(example);
        System.out.println();

        System.out.println("Create a new array and copy elements\n" );

        int[] new_array = resizeArray(example, 10);

        System.out.println("New array size: " + new_array.length);
        System.out.println("New array elements: ");
        print(new_array);

    }




}
