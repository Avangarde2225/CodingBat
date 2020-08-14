package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(10);
        randomAdd(num);
    }
    public static void randomAdd(ArrayList<Integer> a){

        int count = 0;

        for (int i = 0; i < 10; i++) {
            a.add((int)(Math.random()*20+1));
            }

        //Collections.sort(a);
        System.out.println("First version " + a);

        for (int i = 0; i <a.size() ; i++) {
            if(a.get(i)%2==0){

                a.set(i, 111);
                count++;

            }
        }
        if(count ==0){
            System.out.println("There is no even number");
        }
        System.out.println("111 iso even numbers " + a);
    }
}
