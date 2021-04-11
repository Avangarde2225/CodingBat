package arrays1;

import java.util.Arrays;

public class maxEnd3 {
    public static int[] maxEnd3(int[] nums) {
        int biggestValue = Math.max(nums[0], nums[nums.length-1]);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = biggestValue;

        }
        return nums;

    }

    public static void main(String[] args) {
        int arr [] = {1,2,3};

        System.out.println(Arrays.toString(maxEnd3(arr)));
    }
}
