package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(number);
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                int element = Integer.parseInt(command.split(" ")[1]);

                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, element);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);

                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")) {
                int shiftLeftCount = Integer.parseInt(command.split(" ")[2]);

                for (int i = 0; i < shiftLeftCount; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }
            } else if (command.contains("Shift right")) {
                int shiftRightCount = Integer.parseInt(command.split(" ")[2]);

                for (int i = 0; i < shiftRightCount; i++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                }
            }


            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
