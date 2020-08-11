package InterviewQuestions;

public class intArrays {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {2,4,5,6};

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
