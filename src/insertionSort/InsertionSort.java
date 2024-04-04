package src.insertionSort;

/**
 * @author giraykaleli
 */

public class InsertionSort {

    public void display_array(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr){

        for (int i = 0; i < arr.length; i++){ // unsorted section
            int temporary = arr[i];
            int j = i - 1; // sorted section

            while (j >= 0 && arr[j] > temporary){
                arr[j + 1] = arr[j]; // shifting the bigger value to temporary by 1st position
                j = j - 1;
            }

            arr[j + 1] = temporary;
        }

    }

    public static void main(String[] args) {

        int[] array = {8, 5, 1, 7, 2, 3, 9, 10, 4};
        InsertionSort insertionSort = new InsertionSort();

        insertionSort.display_array(array);
        insertionSort.sort(array);
        insertionSort.display_array(array);

    }

}
