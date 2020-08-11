package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        //printing common elements in both lists

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i) == list2.get(j)){
                    System.out.println(list1.get(i));
                }
            }
        }

        System.out.println("----------------------------");

        //replace an element in the arraylist
        List<String> marketList = new ArrayList<>();
        marketList.add("apple");
        marketList.add("orange");
        marketList.add("banana");
        marketList.add("pineapple");

        for (int i = 0; i < marketList.size() ; i++) {
            if(marketList.get(i).equals("orange")){
                marketList.set(i, "grapes");
            }
        }
        System.out.println(marketList);

    }
}
