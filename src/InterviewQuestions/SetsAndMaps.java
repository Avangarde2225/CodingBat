package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SetsAndMaps {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2, "Orange");
        map.put(3, "Grape");
        map.put(4, "Banana");

        for (Integer map1:map.keySet()) {
            System.out.println(map1);
        }

        System.out.println("000000000000000000");

        //find the unique element in the arraylist

        List<String> marketList = new ArrayList<>();
        marketList.add("apple");
        marketList.add("orange");
        marketList.add("apple");
        marketList.add("apple");

        System.out.println(marketList);

        HashSet<String> uniqueFruit = new HashSet<>(marketList);

        System.out.println(uniqueFruit);
    }
}
