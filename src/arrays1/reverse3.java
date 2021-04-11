package arrays1;

public class reverse3 {
    public int[] reverse3(int[] nums) {

        int reversedArr[] = new int[3];
        reversedArr[0] = nums[nums.length - 1];
        reversedArr[1] = nums[nums.length - 2];
        reversedArr[2] = nums[nums.length - 3];
        return reversedArr;
    }

}
