package MethodsLab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTriangle(number);
    }
    public static void printTriangle(int number) {

        for (int i = 1; i <= number; i++) {
            printLIne(1, i);
        }
        for (int i = number - 1; i >=1 ; i--) {
            printLIne(1, i);
        }
    }
    public static void printLIne (int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
