package src.mathematic;

public class MissingNumberInArray {

    /**
     * In this section, we will try to find the missing value in the array which has values in order
     *
     * 1. We will create an example array
     * 2. use math formula : 1+2+3+...+n = nx(n+1)/2 -> give us total
     * 3. then by using the for loop, we will subtract the array's elements from the total amount
     *
     */

    public static void print(int[] arr){

        for (int i=0; i<arr.length; i++){

            System.out.print(arr[i] + "\t");

        }

        System.out.println();
    }

    public static int missingNumber(int[] arr){

        // We need to check in which range the values are
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i< arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Array's values are between " + min + " and " + max );

        // array's values are between min and max, therefore we get max as n
        int total = (max * (max+1)) / 2;

        int missing_number = 0;

        for (int i=0; i< arr.length; i++){

                total = total - arr[i];
                missing_number = total;

        }
        return missing_number;
    }


    public static void main(String[] args) {

        int[] example = {0, 2, 4, 6, 3, 7, 1, 8};

        System.out.println("Existing array values");
        print(example);
        System.out.println("Existing array lenght " + example.length);

        System.out.println("Missing value is " + missingNumber(example));



    }





}
