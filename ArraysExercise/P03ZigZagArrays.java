package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String firstElement = input[0];
            String secondElement = input[1];

            if (i % 2 != 0) {

                firstArr[i - 1] = firstElement;
                secondArr[i - 1] = secondElement;
            } else {
                firstArr[i - 1] = secondElement;
                secondArr[i - 1] = firstElement;
            }
        }
        for (String el : firstArr) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (String el : secondArr) {
            System.out.print(el + " ");
        }




    }
}
