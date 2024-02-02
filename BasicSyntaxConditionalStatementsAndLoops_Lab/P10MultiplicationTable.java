package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= 10 ; num++) {

            System.out.printf("%d X %d = %d%n",number, num, number * num);
        }
    }
}
