package arrays1;

import java.util.Arrays;

public class sameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        if ( nums.length >= 1 && nums[0] == nums[nums.length-1]) {
            return true;
        }
        else {
            return false;
        }


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4,1};
        System.out.println(sameFirstLast(arr));
    }
}
