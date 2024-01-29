package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements1 = scanner.nextLine().split(" ");
        String[] elements2 = scanner.nextLine().split(" ");

        for (int el2 = 0; el2 < elements2.length; el2++) {
            for (int el1 = 0; el1 < elements1.length; el1++) {
                if (elements1[el1].equals(elements2[el2]) ) {
                    System.out.print(elements2[el2] + " ");
                }
            }

        }
    }
}
