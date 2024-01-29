package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int number = Integer.parseInt(scanner.nextLine());


        for (int position = 0; position < numbers.length - 1; position++) {


            for (int nextNum = position + 1; nextNum < numbers.length ; nextNum++) {
                int sum = numbers[position] + numbers[nextNum];
                if (number == sum) {
                    System.out.println(numbers[position] + " " + numbers[nextNum]);
            }

            }
        }
    }
}
