package InterviewQuestions;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        //sum of two numbers that give 100 in total

        int[] arr = {2, 5, 40, 70, 95, 98};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j > i) {
                    if (arr[i] + arr[j] == 100) {
                        System.out.println(arr[i] + " " + arr[j]);
                    }

                }
            }

        }
    }
}
