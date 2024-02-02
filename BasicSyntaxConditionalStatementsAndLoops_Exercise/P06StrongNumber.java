package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNum = scanner.nextLine();
        int sumOfFactorials = 0;

        for (int position = 0; position <= inputNum.length() - 1 ; position++) {

            int digit = Integer.parseInt(inputNum.charAt(position) + "");

            int factorial = 1;
            for (int i = 2; i <= digit ; i++) {
                factorial *= i;

            }
            sumOfFactorials += factorial;

        }
        int number = Integer.parseInt(inputNum);

        if (number == sumOfFactorials) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
