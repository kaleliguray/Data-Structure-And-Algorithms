package src.binarySearch;

/**
 * @author giraykaleli
 *
 * In this part, we will try to find a value by using binary search algorith
 *
 * To use this algorithm, the array should be ordered in ascending.
 *
 * Firstly, we will devide the array in the middle
 * Secondly, divide our array in the middle of it
 * Thirdly, compare our value is bigger than middle or lower than middle
 * Next, depending on the result of compare, we will ignore the other part of the array after dividing it in the middle
 * Finally, do the same process as a loop until find the value
 *
 */

public class BinarySearch {

    public int binarySearch(int[] arr, int key){

        int low = 0; // it indicates the first index of the array
        int high = arr.length - 1; // it indicates the last index of the array

        while (low <= high){

            int mid = (high+low)/2; // it indicates the middle index of the array

            if(arr[mid] == key){
                System.out.print("We found our value "+key+" in the array's elements, and its index is : ");
                return mid;
            }
            if (key < arr[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();

        int[] arr = {1, 10, 20, 47, 59, 65, 75, 88, 99};

        System.out.println(binarySearch.binarySearch(arr, 65));
        System.out.println(binarySearch.binarySearch(arr, 4));


    }



}
