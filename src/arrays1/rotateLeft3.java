package arrays1;

import java.util.Arrays;

public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int [] newArray = new int[3];
        newArray[0] = nums[1];
        newArray[1] = nums[2];
        newArray[2] = nums[0];

        return newArray;

    }
}
