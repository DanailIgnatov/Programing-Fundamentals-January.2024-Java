package ExerciseLists;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!numbers.isEmpty()) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < numbers.size()) {
                int removedNumber = numbers.get(index);
                sum += removedNumber;
                numbers.remove(index);
                modifyList(numbers, removedNumber);
            } else if (index < 0) {
                int removedElement = numbers.get(0);
                sum += removedElement;
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.set(0, lastElement);
                modifyList(numbers, removedElement);
            } else if (index > numbers.size() - 1) {
                int removedElement = numbers.get(numbers.size() - 1);
                sum += removedElement;
                int firstElement = numbers.get(0);
                numbers.set(numbers.size() - 1, firstElement);
                modifyList(numbers, removedElement);
            }

        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedNumber) {

        for (int position = 0; position < numbers.size(); position++) {

            int currentElement = numbers.get(position);

            if (currentElement <= removedNumber) {
                currentElement += removedNumber;
            } else {
                currentElement -= removedNumber;
            }

            numbers.set(position, currentElement);
        }
    }
}
