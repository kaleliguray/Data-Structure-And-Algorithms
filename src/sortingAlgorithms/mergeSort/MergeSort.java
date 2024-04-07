package src.sortingAlgorithms.mergeSort;

/**
 * @author giraykaleli
 *
 * Merge Sort is an algorithm that divides and conquers.
 *
 * Divide: The array is split into two sections in this phase of the process through the use of the array's middle point.
 * Until there are no more half arrays to divide, the process runs recursively for half arrays.
 *
 * Conquer: In this section, we sort the divided arrays by working from the bottom up, combine them, and then obtain the
 * array that is sorted.
 *
 */

public class MergeSort {

    public void sort(int[] arr, int[] temp, int low, int high){

        if (low < high){
            int mid = low +  (high - low)/2; // divide the array into the middle
            sort(arr, temp, low, mid);  // this is left side
            sort(arr, temp, mid+1, high);  // this is right side
            merge(arr, temp, low, mid, high);
        }

    }

    public void merge(int[] arr, int[] temp, int low, int mid, int high){

        // copy the array to the temp array
        for (int i = low; i <= high; i++){
            temp[i] = arr[i];
        }

        int i=low;
        int j=mid + 1;
        int k=low;

        while (i <= mid && j <=high){

            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            arr[k] = temp[i];
            i++;
            k++;
        }

    }

    public void display_array(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {8, 5, 1, 7, 2, 3, 9, 10, 4};

        MergeSort mergeSort = new MergeSort();
        mergeSort.display_array(array);
        mergeSort.sort(array, new int[array.length], 0, array.length-1);
        mergeSort.display_array(array);


    }


}
