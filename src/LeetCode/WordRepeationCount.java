package LeetCode;


public class WordRepeationCount {
    public static void main(String[] args) {
        String str = "Java java java java java ja va java";

        int javaCounter = 0;

        String[] arr = str.toLowerCase().split(" ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("java")) {
                javaCounter++;

            }

        }
        System.out.println(javaCounter);

    }

}
