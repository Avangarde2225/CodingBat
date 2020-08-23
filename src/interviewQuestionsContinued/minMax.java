package interviewQuestionsContinued;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        System.out.println("Enter 2 integers: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();

        int min = n1 > n2 ? n2 : n1;
        int max = n1 > n2 ? n1 : n2;

        System.out.println("min is " + min  + " Max is " + max);
    }
}
