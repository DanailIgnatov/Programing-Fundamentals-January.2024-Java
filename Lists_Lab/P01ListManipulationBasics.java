package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] splitCommand = command.split(" ");
            int workingNumber = Integer.parseInt(splitCommand[1]);
                    switch (splitCommand[0]) {
                case "Add":
                    numbers.add(workingNumber);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(workingNumber));
                    break;
                case "RemoveAt":
                    numbers.remove(workingNumber);
                    break;
                case "Insert":
                    int position = Integer.parseInt(splitCommand[2]);
                    numbers.add(position, workingNumber);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
