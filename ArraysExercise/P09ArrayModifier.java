package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        String task = scanner.nextLine();


        while (!task.equals("end")) {
           
            if (task.contains("swap")) {
                int firstIndex = Integer.parseInt(task.split(" ")[1]);
                int secondIndex = Integer.parseInt(task.split(" ")[2]);

                int firstIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

                numbers[firstIndex] = secondIndexNumber;
                numbers[secondIndex] = firstIndexNumber;

            } else if (task.contains("multiply")) {
                int firstIndex = Integer.parseInt(task.split(" ")[1]);
                int secondIndex = Integer.parseInt(task.split(" ")[2]);

                int firstIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

                int product = firstIndexNumber * secondIndexNumber;
                numbers[firstIndex] = product;

            } else if (task.contains("decrease")) {
                for (int position = 0; position <= numbers.length - 1 ; position++) {
                    numbers[position] --;
                }
            }
            task = scanner.nextLine();
        }
        System.out.println(
                Arrays.toString(numbers)
                        .replace("[", "")
                        .replace("]", "")
        );
    }
}
