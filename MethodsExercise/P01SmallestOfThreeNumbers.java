package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printMinNumberAmongThree(firstNum, secondNum, thirdNum);
    }

    private static void printMinNumberAmongThree(int first, int second, int third) {
        int firstMinNumber = Math.min(first, second);
        int theSmallestNumber = Math.min(firstMinNumber, third);

        System.out.println(theSmallestNumber);
    }
}
