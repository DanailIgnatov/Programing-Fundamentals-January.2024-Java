package MethodsLab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int area = area(length, width);
        System.out.println(area);
    }

    public static int area(int n1, int n2) {
        return n1 * n2;
    }
}
