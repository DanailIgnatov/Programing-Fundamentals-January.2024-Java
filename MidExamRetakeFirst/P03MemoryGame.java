package MidExamRetakeFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String twoNumbers = scanner.nextLine();

        int moves = 0;

        while (!twoNumbers.equals("end")) {
            int firstNumber = Integer.parseInt(twoNumbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(twoNumbers.split(" ")[1]);

            moves++;

            boolean isValid = isValid(firstNumber, secondNumber,numbers.size() - 1);

            if (!isValid) {
                String newElement = String.format("-%da", moves);
                numbers.add(numbers.size() / 2, newElement);
                numbers.add(numbers.size() / 2, newElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstElement = numbers.get(firstNumber);
                String secondElement = numbers.get(secondNumber);

                if (firstElement.equals(secondElement)) {
                    numbers.remove(firstElement);
                    numbers.remove(secondElement);
                    System.out.printf("Congrats! You have found matching elements - %s!\n", firstElement);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (numbers.isEmpty()) {
                System.out.printf("You have won in %d turns!\n", moves);
                return;
            }

            twoNumbers = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", numbers));
    }

    private static boolean isValid(int firstNumber, int secondNumber, int lastIndex) {

        boolean areNotTheSameIndex = firstNumber != secondNumber;
        boolean firstIndexInBounds = firstNumber >= 0 && firstNumber <= lastIndex;
        boolean secondIndexInBounds = secondNumber >= 0 && secondNumber <= lastIndex;

        return areNotTheSameIndex && firstIndexInBounds && secondIndexInBounds;
    }
}
