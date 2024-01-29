package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number > 0) {

            int digit = number % 10;
            int newNumber = number / 10;
            sum += digit;
            number = newNumber;
        }
        System.out.println(sum);


    }
}
