package InterviewQuestions;

import java.util.Arrays;

public class arrs {
    public static void main(String[] args) {

        // replace index 2 with boston
        String[] s1 = new String[]{"new jersey", "atlanta", "new york", "new jersey", "new york"};

        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("new york")) {
                s1[i] = "boston";
                break;
            }
        }
        for (int i = 0; i < s1.length; i++) {


            System.out.println(s1[i]);
        }

        System.out.println("Array 2------------------");
        int arr[] = {564, 56, 6, 34, 33, 1, 3, 5, 6, 7, 8, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }



}
