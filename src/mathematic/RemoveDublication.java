package src.mathematic;

/**
 * @author dinesh-varyani
 * @see {@linktourl https://github.com/dinesh-varyani}
 */

public class RemoveDublication {

    public static int remove(int[] nums){
        int  i = 1;

        for (int j=1; j< nums.length; j++){
            if (nums[j-1] != nums[i]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] numbers = {0, 0, 1, 2, 2, 2, 4, 4};

        System.out.println(remove(numbers));
    }

}

