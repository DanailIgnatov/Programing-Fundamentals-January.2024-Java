package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());

        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int position = 0; position < wagons.length; position++) {

            int different = 4 - wagons[position];

            if (peoples < 4) {
                wagons[position] += peoples;
                peoples = 0;
                break;
            }
            if (wagons[position] < 4) {
                wagons[position] += different;
            }
            peoples -= different;
        }
        if (peoples == 0 && wagons[wagons.length - 1] == 4) {
            for (int wagon : wagons) {
                System.out.print(wagon + " ");
            }
            return;
        }
        if (peoples == 0) {
            System.out.println("The lift has empty spots!");
        } else if (peoples > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peoples);
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
