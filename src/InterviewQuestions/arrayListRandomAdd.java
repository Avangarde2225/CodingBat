package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListRandomAdd {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        findCommonAndWrite(a, b);

    }

    public static void findCommonAndWrite(ArrayList<Integer> r, ArrayList<Integer> s) {
        for (int i = 0; i < 6; i++) {
            r.add((int) (Math.random() * 50));
        }
        Collections.sort(r);
        System.out.println("First array " + r);

        for (int i = 0; i < 6; i++) {
            s.add((int) (Math.random() * 50));
        }
        Collections.sort(s);
        System.out.println("Second array " + s);

        ArrayList<Integer> commonElements= new ArrayList<>();
        int count = 0;

        for (int i = 0; i <r.size() ; i++) {
            for (int j = 0; j <s.size() ; j++) {
                if(r.get(i).equals(s.get(j))){
                    count++;
                    commonElements.add(r.get(i));
                }
            }
        }
        if(count==0){
            System.out.println("No common elements");
        } else{
            System.out.println("Common element/s is/are: " + commonElements);
        }
    }
}
