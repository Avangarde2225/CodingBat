package InterviewQuestions;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        //putting 0th index to the last one

        int a [] = {4,5,3,2,6,7,8,9,10};

        int num = 0;
        int min = a[0];

        int size = a.length;

        for (int i = 1; i < size; i++) {
            if(a[i] < min){
                min = a[i];
                num = i;
            }
        }
        a[num] = a[0];
        a[0]= min;
        System.out.println(Arrays.toString(a));

    }
}
