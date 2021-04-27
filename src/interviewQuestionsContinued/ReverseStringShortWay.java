package interviewQuestionsContinued;

public class ReverseStringShortWay {
    public static void main(String[] args) {
        String str = "deneme";
        String str1 = new StringBuilder(str).reverse().toString();
        System.out.println(str1);
    }
}
