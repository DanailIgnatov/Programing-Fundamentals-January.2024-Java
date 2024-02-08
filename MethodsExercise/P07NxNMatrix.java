package MethodsExercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printMatrixWhithOneNumber(number);
    }

    private static void printMatrixWhithOneNumber(int number) {

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
