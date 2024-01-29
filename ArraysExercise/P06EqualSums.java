package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int position = 0; position < numbers.length; position++) {
            int currentNumber = numbers[position];

            int sumRightNumbers = 0;
            int sumLeftNumbers = 0;

            for (int leftPositions = 0; leftPositions < position; leftPositions++) {
                sumLeftNumbers += numbers[leftPositions];

            }
            for (int rightPositons = position + 1; rightPositons < numbers.length; rightPositons++) {
                sumRightNumbers += numbers[rightPositons];
            }
            if (sumLeftNumbers == sumRightNumbers) {
                System.out.println(position);
                return;
            }
        }
        System.out.println("no");
    }
}
