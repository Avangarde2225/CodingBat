package interviewQuestionsContinued;

public class thirdLargestArray {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 16};
        int n = arr.length;
        thirdLargest(arr, n);

    }

    static void thirdLargest(int arr[], int arr_size) {

        // There should beatleast three elements

        if (arr_size < 3) {
            System.out.println(" Invalid Input ");
        }

        int first = arr[0];
        int secondLargest= Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;


        for (int i = 1;i < arr_size ; i++)
            if (arr[i] > first)
                first = arr[i];

        for (int i = 0; i < arr_size ; i++)
            if (arr[i] > secondLargest && arr[i] < first)
                secondLargest = arr[i];

        for (int i = 0; i < arr_size ; i++)
            if (arr[i] > thirdLargest && arr[i] < secondLargest)
                thirdLargest = arr[i];

        System.out.printf("The third Largest " + "element is %d\n", thirdLargest);
    }
}

