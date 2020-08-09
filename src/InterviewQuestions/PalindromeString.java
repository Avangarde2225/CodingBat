package InterviewQuestions;

public class PalindromeString {

    public static void main(String[] args) {


        String pal = "ey edip adanada pide ye";

        int start = 0;
        int end = pal.length() - 1;
        boolean flag = true;

        for (int i = start; start < end; start++, end--) {
            if (pal.charAt(start) == pal.charAt(end)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("This word is a palindrome...");


        }

    }
}
