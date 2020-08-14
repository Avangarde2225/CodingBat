package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Amazon", 300);
        map.put("Ebay", 450);
        map.put("Rakuten", 500);
        map.put("Walmart", 289);
        map.put("Jet", 330);

        int sum=0;

        for(Map.Entry<String, Integer> top : map.entrySet()) {
            System.out.println(top.getKey() + " " + top.getValue());
        }

        System.out.println("---------------------");

        for(String key: map.keySet()){
            System.out.println("Keys " + key);
        }
        for(Integer value: map.values()){
            System.out.println("Values " + value);
        }


    }
}
