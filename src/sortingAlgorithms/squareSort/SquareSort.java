package src.sortingAlgorithms.squareSort;

/**
 * @author giraykaleli
 *
 * First of all, the given array's elements must be sorted ascendig order
 * Then, we should check every element by using the absolute value method in Java to compare which one is bigger
 * Finally, we will create a temporary array to keep the array's elements square version in it; and return it.
 *
 */

public class SquareSort {

    public int[] squareSorted(int[] arr){

        int[] temporary = new int[arr.length];

        int i = 0;  // start from the first index of array
        int j = arr.length - 1; // start from the last index of array

        for (int k = arr.length-1; k >= 0; k--){

            if (Math.abs(arr[i]) > Math.abs(arr[j])){
                temporary[k] = arr[i] * arr[i]; // Math.sqrt(arr[i]) ---> but it returns double type
                i++;

            } else {
                temporary[k] = arr[j] * arr[j];
                j--;

            }
        }
        return temporary;
    }

    public void display_array(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {-4, -3, -2, 0, 5, 7, 10};

        SquareSort squareSort = new SquareSort();

        squareSort.display_array(array);
        System.out.println();
        squareSort.display_array(squareSort.squareSorted(array));


    }

















}
