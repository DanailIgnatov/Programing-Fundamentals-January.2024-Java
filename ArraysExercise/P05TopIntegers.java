package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int position = 0; position < numbers.length; position++) {
            boolean topNumber = true;
            int currentNum = numbers[position];
            int maxNumLeft = 0;
            for (int nextNumber = position + 1; nextNumber < numbers.length ; nextNumber++) {

                int nextNum = numbers[nextNumber];
                if (currentNum <= nextNum) {
                    topNumber = false;
                    break;
                } else {
                    maxNumLeft = currentNum;
                }

            }
            if (topNumber) {
                if (position == numbers.length - 1) {
                    System.out.print(numbers[numbers.length - 1]);
                    return;
                } else {
                    System.out.print(maxNumLeft + " ");
                }
            }

        }
    }
}
