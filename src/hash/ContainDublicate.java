package src.hash;

import java.util.HashSet;
import java.util.Set;

public class ContainDublicate {

    public static boolean contains_dublicate(int[] nums){

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 4, 1};

       boolean dublicate = contains_dublicate(arr);

        System.out.println("Whether does it involve a duplicate value or not?: " + dublicate);
    }

}
