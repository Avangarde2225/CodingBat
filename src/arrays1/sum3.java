package arrays1;

public class sum3 {
    public static int sum3(int[] nums) {
        int sum =0;
        for (int i = 0; i<nums.length;i++){
            sum += nums[i] ;

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3};
        System.out.println(sum3(arr));
    }
}
