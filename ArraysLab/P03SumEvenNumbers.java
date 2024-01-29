package ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;

        for (int position = 0; position < numbersArr.length; position++) {
            if (numbersArr[position] % 2 == 0) {
                sum += numbersArr[position];
            }
        }
        System.out.println(sum);

    }
}
