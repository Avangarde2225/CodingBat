package InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class secondLargestArrayList {
    public static void main(String[] args) {
        //find the second largest number in the arraylist

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(48);
        list1.add(99);

        System.out.println(list1.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst());


    }
}
