package Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Contains")) {
                printContainsOrNotNumber(numbers, command);
            } else if (command.contains("Print")) {
                printOddOrEven(numbers, command);
            } else if (command.equals("Get sum")) {
                printSumOfList(numbers, command);
            } else if (command.contains("Filter")) {
                printFilter(numbers, command);
            }
            command = scanner.nextLine();
        }
    }
    public static void printContainsOrNotNumber(List numbers, String command) {
        String[] input = command.split(" ");
        int number = Integer.parseInt(input[1]);

        for (int i = 0; i < numbers.size(); i++) {
            int num = (int) numbers.get(i);
            if (number == num) {
                System.out.println("Yes");
                return;
            }

        }
        System.out.println("No such number");
    }
    public static void printOddOrEven (List numbers, String command) {
        String[] input = command.split(" ");
        String oddOrEven = input[1];

        List<Integer> evensOrOddsNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            int number = (int) numbers.get(i);

            if (oddOrEven.equals("even")) {
                if (number % 2 == 0) {
                    evensOrOddsNumbers.add(number);
                }
            } else if (oddOrEven.equals("odd")) {
                if (number % 2 != 0) {
                    evensOrOddsNumbers.add(number);
                }
            }
        }
        System.out.println(evensOrOddsNumbers.toString().replaceAll("[\\[\\],]", ""));

    }
    public static void printSumOfList (List numbers, String command) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = (int) numbers.get(i);
            sum += number;
        }
        System.out.println(sum);
    }
    public static void printFilter (List numbers, String command) {
        String[] input = command.split(" ");
        String operation = input[1];
        int number = Integer.parseInt(input[2]);

        List<Integer> filterNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            int currentNumber = (int) numbers.get(i);
            if (operation.equals("<")) {
                if (number > currentNumber) {
                    filterNumbers.add(currentNumber);
                }
            } else if (operation.equals("<=")) {
                if (number >= currentNumber) {
                    filterNumbers.add(currentNumber);
                }
            } else if (operation.equals(">")) {
                if (number < currentNumber) {
                    filterNumbers.add(currentNumber);
                }
            } else if (operation.equals(">=")) {
                if (number <= currentNumber) {
                    filterNumbers.add(currentNumber);
                }
            }
        }
        System.out.println(filterNumbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
