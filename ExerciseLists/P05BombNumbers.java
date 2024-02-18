package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] bombAndShesPower = scanner.nextLine().split(" ");

        String bombNumber = bombAndShesPower[0];
        int bombPower = Integer.parseInt(bombAndShesPower[1]);

        while (elements.contains(bombNumber)) {
            int elementIndex = elements.indexOf(bombNumber);

            int start = elementIndex - bombPower;
            if (start < 0) {
                start = 0;
            }
            int end = elementIndex + bombPower;
            if (end > elements.size() - 1) {
                end = elements.size() - 1;
            }

            for (int index = end; index >= start; index--) {
                elements.remove(index);
            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }
}
