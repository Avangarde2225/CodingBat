package interviewQuestionsContinued;

public class findOneMissingNumber {
    public static void main(String[] args) {
    int arr [] = {1,2,3,4,5,6,7,9,10};
        System.out.println(findMissingOne(arr,10));
    }
    static int findMissingOne(int num [], int n){

        int exp = n*(n+1)/2;

           int act = 0;
            for (int nums:num){
                act +=nums;
            }
            return exp - act;
    }
}
