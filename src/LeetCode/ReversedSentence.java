package LeetCode;

public class ReversedSentence {
    public static void main(String[] args) {
        String str = " a good example";

        String words [] = str.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {

                reversedString = " "+  words[i] + reversedString;

        }
        System.out.println( reversedString);
    }
}