package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[input];

        int sumOfPeople = 0;
        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            sumOfPeople += wagons[i];
            System.out.print(wagons[i] + " ");
        }
        System.out.println();
        System.out.println(sumOfPeople);
    }
}
