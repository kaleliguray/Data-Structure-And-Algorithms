package src.sortingAlgorithms.quickSort;

/**
 * @author giraykaleli
 */

public class QuickSort {

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        int j = low;

        while (i <= high){
            if (arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }

    public void sort(int[] arr, int low, int high){
        if (low < high){
            int p = partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
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

        QuickSort quickSort = new QuickSort();
        quickSort.display_array(array);
        System.out.println();
        quickSort.sort(array, 0, array.length-1);
        quickSort.display_array(array);
    }

}
