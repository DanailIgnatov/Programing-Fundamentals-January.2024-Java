package MidExamRetake;

import java.util.*;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> topFiveNumbers = new ArrayList<>();
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double averageSum = sum * 1.0 / numbers.length;
        for (int number : numbers) {
            if (number > averageSum) {
                topFiveNumbers.add(number);
            }
        }
        if (topFiveNumbers.isEmpty()) {
            System.out.println("No");
        }
        Collections.sort(topFiveNumbers);
        Collections.reverse(topFiveNumbers);
        for (int i = 0; i < topFiveNumbers.size(); i++) {
            if ( i == 5) {
                break;
            }
            System.out.print(topFiveNumbers.get(i) + " ");
        }


    }
}
