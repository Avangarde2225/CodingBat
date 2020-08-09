package InterviewQuestions;

import java.util.Arrays;

public class JavaStreams {
    public static void main(String[] args) {
        String s = "tayyar";
        System.out.println(reverse(s));
        System.out.println(streamReverse(s));
    }
    public static String reverse(String str){
        var result ="";
        for(var i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    public static String streamReverse(String str){
        return Arrays.stream(str.split(""))
                .reduce("",(x,y)->y+x);
    }
}
