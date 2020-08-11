package InterviewQuestions;

public class CountingNumberOfWords {
    public static void main(String[] args) {

        String s2 = "Count the words in the String";
        char[] s = s2.toCharArray();

        System.out.println("letter count " + s.length);

        //counting the words

        String [] s3 = s2.split(" ");


        for (int i = 0; i <s3.length ; i++) {
            System.out.println(s3[i]);
        }
        System.out.println("word count " + s3.length);
    }
}
