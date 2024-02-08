package MethodsLab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        executeOperation(operation, number1, number2);
    }

    public static void executeOperation(String operation, int n1, int n2) {
        switch (operation) {
            case "add":
                add(n1, n2);
                break;
            case "multiply":
                multiply(n1, n2);
                break;
            case "subtract":
                subtract(n1, n2);
                break;
            case "divide":
                divide(n1, n2);
                break;
        }
    }

    public static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public static void subtract(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public static void divide(int n1, int n2) {
        System.out.println(n1 / n2);
    }
}
