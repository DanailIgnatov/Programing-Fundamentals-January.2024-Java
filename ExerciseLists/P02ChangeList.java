package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Delete")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(List.of(number));
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split(" ")[2]);
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(index, number);
            }

            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
