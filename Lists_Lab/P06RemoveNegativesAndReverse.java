package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P06RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        if (positiveNumbers.isEmpty()){
            System.out.println("empty");
            return;
        }
        Collections.reverse(positiveNumbers);
        System.out.println(positiveNumbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
