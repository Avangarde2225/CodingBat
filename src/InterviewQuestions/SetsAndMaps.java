package InterviewQuestions;

import java.util.HashMap;

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
    }
}
