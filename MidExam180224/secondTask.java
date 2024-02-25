package MidExam180224;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {

            String command = input.split(" ")[0];
            int number = Integer.parseInt(input.split(" ")[1]);

            switch (command) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    for (int index = 0; index < numbers.size(); index++) {
                        if (numbers.get(index) == number) {
                            numbers.remove(index);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(input.split(" ")[2]);
                    for (int index = 0; index < numbers.size(); index++) {
                        if (numbers.get(index) == number) {
                            numbers.set(index, replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    for (int index = numbers.size() - 1; index >= 0; index--) {
                        if (numbers.get(index) < number) {
                            numbers.remove(index);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
