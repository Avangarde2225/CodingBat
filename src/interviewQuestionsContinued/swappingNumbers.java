package interviewQuestionsContinued;

import java.util.Scanner;

public class swappingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        System.out.println("Enter 2 integers: ");

        n1 = scan.nextInt();
        n2 = scan.nextInt();

        int tmp = n1;
        n1 = n2;
        n2 = tmp;
        System.out.println("n1 is " + n1 + " n2 is " + n2);


    }

}
