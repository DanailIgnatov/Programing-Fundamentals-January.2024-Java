package Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        List<Integer> newList = new ArrayList<>();

        int sizeNumbersList = numbers.size();
        for (int index = 0; index < numbers.size(); index++) {
            if (index == (sizeNumbersList / 2)) {
                int lastDigit = numbers.get(numbers.size() -1);
                newList.add(lastDigit);
                break;
            }
            int n1 = numbers.get(index);
            int n2 = numbers.get(numbers.size() - 1);
            newList.add(n1 + n2);
            numbers.remove(numbers.size() - 1);


        }
        System.out.println(newList.toString().replaceAll("[\\[\\],]",""));
    }
}
