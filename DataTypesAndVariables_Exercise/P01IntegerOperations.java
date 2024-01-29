package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        int sum = number1 + number2;
        int divide = sum / number3;
        int multiply = divide * number4;

        System.out.println(multiply);
    }
}
