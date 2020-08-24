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

        for (int i = 1; i < arr_size; i++) {
            /* If current element is greater than first,
        then update first, second and third */
            if (arr[i] > first) {
                thirdLargest = secondLargest;
                secondLargest = first;
                first = arr[i];
            } /* If arr[i] is in between first and second */
            else if (arr[i] > secondLargest) {
                thirdLargest= secondLargest;
                secondLargest = arr[i];
            } /* If arr[i] is in between second and third */
            else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }

        System.out.printf("The third Largest " + "element is %d\n", thirdLargest);
    }
}

