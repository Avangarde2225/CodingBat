package InterviewQuestions;


import java.util.Arrays;

public class OrganizingArraysFromSmallest {
    public static void main(String[] args) {

        int min, indexNum;

        int a[] = {3,4,5,6,7,1,2,14,24,56,78,44,33,12,45};

        for (int i = 0; i < a.length-1; i++) {
            min = a[i];
            indexNum = i;
            for (int j = i+1; j < a.length ; j++) {
                if(a[j] < min){
                    min = a[j];
                    indexNum=j;
                }
            }
            a[indexNum] = a[i];
            a[i]= min;
        }
        System.out.println(Arrays.toString(a));
    }

}
