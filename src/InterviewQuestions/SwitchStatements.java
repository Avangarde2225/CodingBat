package InterviewQuestions;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        int checkingBalance = 1000;
        int activity;

        Scanner scan = new Scanner(System.in);

        activity = scan.nextInt();

        switch(activity){
            case 1:
                System.out.println("Total balance is " + checkingBalance);
                break;

            case 2:
                System.out.println("How much you would like to deposit into your account?");

                int amount = scan.nextInt();

                checkingBalance +=amount;

                System.out.println("New balance is " + checkingBalance);
                break;

            case 3:
                System.out.println("How much you would like to withdraw?");
                amount = scan.nextInt();
                checkingBalance -= amount;
                System.out.println("Your new balance is " + checkingBalance);
                break;

            case 4:
                System.out.println("System shutting down");
                break;
            default:
                System.out.println("Wrong amount");
                break;

        }
    }
}
