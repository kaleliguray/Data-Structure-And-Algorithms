package src.sortingAlgorithms;

/**
 * @author giraykaleli
 *
 * In this part, we will merge two different arrays
 * But, Our rule is that both of them should be sorted arrays
 *
 */

public class MergeTwoSortedArrays {

    public int[] merge(int[] first_arr, int[] second_arr, int n, int m){

        int[] result = new int[n + m];

        int i = 0; // travel in the first array
        int j = 0; // travel in the second array
        int k = 0; // travel in the result array

        while ( i < n && j < m ){ // array out of bound conditions

            if (first_arr[i] < second_arr[j]){
                result[k] = first_arr[i];
                i++;
            } else {
                result[k] = second_arr[j];
                j++;
            }
            k++;
        }

        while (i < n){

            result[k] = first_arr[i];
            i++;
            k++;
        }

        while (j < m){

            result[k] = second_arr[j];
            j++;
            k++;
        }

        return result;
    }

    public void display_array(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] first = {1, 5, 7, 8};
        int[] second = {2, 3, 4, 9, 10};

        MergeTwoSortedArrays mergeTwoSortedArrays =  new MergeTwoSortedArrays();

        System.out.println("First array is : ");
        mergeTwoSortedArrays.display_array(first);
        System.out.println("Second array is : ");
        mergeTwoSortedArrays.display_array(second);

        System.out.println("\n**** Merge Two Sorted Arrays ****");
        int[] result = mergeTwoSortedArrays.merge(first, second, first.length, second.length);
        mergeTwoSortedArrays.display_array(result);


    }


}
