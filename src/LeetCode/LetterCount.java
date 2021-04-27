package LeetCode;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LetterCount {
    static void charCount(String str){
        String s = " ";
        s = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        char [] newChar = s.toCharArray();

        for (char c : newChar) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        String s = "Babalamamama";
        charCount(s);
    }
}
