package src.linearSearch;

/**
 * @author giraykaleli
 *
 * In this part, we will try to search for a value in the array
 *
 *  This search is called the Linear Search Algorithm
 */

public class LinearSearch {

    public int search(int[] arr, int length, int value){

        for (int i = 0; i < length; i++){

            if (arr[i] == value){
                System.out.print("We found our value "+value+" in the array's elements, and its index is : ");
                return i;
            }
        }
        return -1; // if we did not find the value, we will return -1
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 9, 2, 10, 15, 20};

        LinearSearch linearSearch = new LinearSearch();

        System.out.println(linearSearch.search(arr, arr.length, 10));
        System.out.println(linearSearch.search(arr, arr.length, 8));

    }







}
