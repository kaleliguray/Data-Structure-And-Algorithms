package src.sortingAlgorithms.arrangeMaxMinSorting;

/**
 * @author giraykaleli
 *
 * In this algorithm, firstly, we will split the array namely even and odd numbers regarding the array index
 * Secondly, we will use two pointer max and min
 * Thirdly, we will put the max value inside the odd index, and the min value is placed inside the even index
 * When we are doing it, we use this formula:
 * arr[i] = arr[i] + (arr[maxID] % max) * max;
 * arr[i] = arr[i] + (arr[minID] % max) * max;
 */

public class ArrangeMaxMin {

    public void arrangeMaxMin(int[] arr){

        int maxId = arr.length - 1;
        int minId = 0;
        int max = arr[maxId] + 1;

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                arr[i] = arr[i] + (arr[maxId] % max) * max;
                maxId--;

            } else {
                arr[i] = arr[i] + (arr[minId] % max) * max;
                minId++;

            }
        }

        for (int i = 0; i< arr.length; i++){
            arr[i] = arr[i] / max;
        }
    }

    public void display_array(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 6, 8, 9};

        ArrangeMaxMin arrangeMaxMin = new ArrangeMaxMin();
        arrangeMaxMin.display_array(array);
        System.out.println();
        arrangeMaxMin.arrangeMaxMin(array);
        arrangeMaxMin.display_array(array);
    }

}
