package MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoDigits(firstNumber, secondNumber);
        int result = subtractTwoNumbers(sum, thirdNumber);

        System.out.println(result);
    }

    public static int sumTwoDigits(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtractTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }
}
