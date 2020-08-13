package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> r= new ArrayList<>();

        randomAdd(r);

    }
    public static void randomAdd(ArrayList<Integer> a){
        int count = 0;
        for (int i = 0; i <= 10 ; i++) {
            a.add((int)(Math.random()*100));
            if(a.get(i) <= 20){
                System.out.println(a.get(i));
                count++;
            }
            }
        Collections.sort(a);
        if(count==0){
            System.out.println("Nothing smaller than 20");
        }
    }
}
