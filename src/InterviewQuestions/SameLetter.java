package InterviewQuestions;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetter {
    public static void main(String[] args) {
        System.out.println(Same("Hello", "hello"));
    }
    public static boolean Same(String str1, String str2){
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2= new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }
}
