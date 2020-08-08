package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String word = "aaaaaaaaaammmmaaaabbbbkkkkbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeefffffff";

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),1);
            } else{
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
        }
        for(Map.Entry each: map.entrySet()){
            System.out.println("word contains " + each.getValue() + " times " + each.getKey());
        }
    }
}
