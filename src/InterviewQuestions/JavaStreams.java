package InterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JavaStreams {
    public static void main(String[] args) {
        String s = "tayyar";
        int a = 11;

        System.out.println(reverse(s));
        System.out.println(streamReverse(s));
        System.out.println(sum(a));
    }
    public static String reverse(String str){
        var result ="";
        for(var i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    public static String streamReverse(String str){
        return Arrays.stream(str.split("")).reduce("",(x,y)->y+x);
    }
    public static int sum(int n){
        return IntStream.range(0,n).reduce(0,(x,y) -> x+y);
    }

}
