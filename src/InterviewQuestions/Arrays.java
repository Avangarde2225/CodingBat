package InterviewQuestions;

public class Arrays {
    public static void main(String[] args) {

        // replace index 2 with boston
        String[] s1 = new String[]{"new jersey", "atlanta", "new york", "new jersey", "new york"};

        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("new york")) {
                s1[i] = "boston";
                break;
            }
        }
        for (int i = 0; i < s1.length; i++) {


            System.out.println(s1[i]);
        }
    }
}
