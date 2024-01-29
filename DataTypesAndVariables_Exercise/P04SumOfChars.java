package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfChars = Integer.parseInt(scanner.nextLine());

        int sumOfChars = 0;
        for (int character = 1; character <= numberOfChars ; character++) {
            char nextChar = scanner.nextLine().charAt(0);
            int digit = (int) nextChar;
            sumOfChars += digit;
        }
        System.out.printf("The sum equals: %d", sumOfChars);
    }
}
