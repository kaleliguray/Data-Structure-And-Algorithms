package src.sortingAlgorithms.selectionSort;

/**
 * @author giraykaleli
 *
 * In this algorithm, when we are sorting, first of all we choose minumum element in the array
 *
 * And then make comparasion between sorted section and unsorted section
 */

public class SelectionSort {

    public void display_array(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            int min = i;

            for (int j = i + 1; j < arr.length; j++){

                if (arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    public int searchInsert(int[] arr, int target){

        int low = 0;

        int high = arr.length - 1;

        while (low <= high){

            int mid = low + (high - low)/2;

            if (arr[mid] == target){
                return arr[mid];
            }

            if (target < arr[mid]){
                high = mid - 1;

            }else {
                low = mid + 1;
            }
        }
    return low;
    }

    public static void main(String[] args) {

        int[] array = {8, 5, 1, 7, 2, 3, 9, 10, 4};

        SelectionSort selectionSort = new SelectionSort();

        selectionSort.display_array(array);
        selectionSort.sort(array);
        selectionSort.display_array(array);

        System.out.println(selectionSort.searchInsert(array, 6));
    }

}
