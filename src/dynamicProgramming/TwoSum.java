package src.dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map =  new HashMap<>();

        for (int i = 0; i<numbers.length; i++){

            if (!map.containsKey(target - numbers[i])){
                map.put(numbers[i], i);

            } else {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;

            }
        }
        throw new IllegalArgumentException("Two numbers not found");
    }

    public static int[] two_sum(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];

        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;

            }else if (sum < target){
                left++;

            }else {
                right--;
            }
        }
        return new int[0];
    }

    public static void printArray(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayDemo(){
        int[] arr = {11, 2, 0, 10, 7, 6};
        int[] result = two_sum(arr, 9);
        printArray(result);
    }

    public static void main(String[] args) {

        int[] numbers = new int[] {2, 11, 5, 10, 7, 8};
        int[] result =  twoSum(numbers, 9);
        System.out.println("The two indices are - " + result[0] + " and " + result[1]);

        System.out.println();

        System.out.println("*** 2. two_sum method ***");
        arrayDemo();


    }

}
