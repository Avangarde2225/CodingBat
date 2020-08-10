package InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDups {
    public static void main(String[] args) {
        System.out.println(removeDup("Hello"));
        System.out.println(methodUsingHash("Heloo"));
    }
    public static String removeDup(String str){
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(""+str.charAt(i))){
                result +=""+str.charAt(i);
            }
        }
        return result;
    }

    public static String methodUsingHash(String str){
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(",", "").replace("[","").replace("]","");
        return str;
    }
}
