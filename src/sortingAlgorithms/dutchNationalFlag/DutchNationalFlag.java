package src.sortingAlgorithms.dutchNationalFlag;

/**
 * @author giraykaleli
 *
 */

public class DutchNationalFlag {

    public void three_number_sort(int[] arr){
        int i = 0; // low
        int j = 0; // mid
        int k = arr.length - 1; // high

        while (i <= k) {

            if(arr[i] == 0){
                alter(arr, i , j);
                i++;
                j++;

            }else if(arr[i] == 1){
                i++;

            } else if (arr[i] == 2) {
                alter(arr, i, k);
                k--;
            }
        }
    }

    public void alter(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public void display_array(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        int[] array = {2, 2, 1, 0 , 2, 0, 1};

        DutchNationalFlag dutchNationalFlag = new DutchNationalFlag();

        dutchNationalFlag.display_array(array);
        System.out.println();
        dutchNationalFlag.three_number_sort(array);
        dutchNationalFlag.display_array(array);

    }

}
