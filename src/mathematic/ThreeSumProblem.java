package src.mathematic;

import java.util.Arrays;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class ThreeSumProblem {

    public static void three_sum(int[] arr, int target){
        Arrays.sort(arr);

        for (int i=0; i<arr.length-2; i++){
            int j = i + 1;
            int k = arr.length - 1;

            while ( j<k ){
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == target){
                    System.out.println(arr[i] + " , " + arr[j]  +  " , " + arr[k]);
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                }else {
                    k--;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 3, 1, 0};

        three_sum(arr, 6);

    }
}
