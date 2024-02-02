package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int numbers = number1; numbers <= number2; numbers++) {
            sum += numbers;
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
