package src.dynamicProgramming;

public class MaxSumSubarray {

    public static int max_sum_sub_array(int[] arr){
        int current_max =  arr[0];
        int max_so_far = arr[0];

        for (int i = 1; i<arr.length; i++){
            current_max = current_max + arr[i]; // Q1 element becomes part of the current subarray

            if (current_max < arr[i]){
                current_max = arr[i]; // Q2 element decides to start its own subarray
            }
            if (max_so_far < current_max){
                max_so_far = current_max;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, -3, -1, 10, 12, 8, -2, -7, 6, 9};

        System.out.println(max_sum_sub_array(arr));




    }


}
