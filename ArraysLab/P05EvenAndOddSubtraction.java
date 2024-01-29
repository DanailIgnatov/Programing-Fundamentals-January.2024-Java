package ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumEvens = 0;
        int sumOdds = 0;

        for (int numbers = 0; numbers < numbersArr.length; numbers++) {
            if (numbersArr[numbers] % 2 == 0) {
                sumEvens += numbersArr[numbers];
            } else {
                sumOdds += numbersArr[numbers];
            }
        }
        int subtraction = sumEvens - sumOdds;
        System.out.println(subtraction);
    }
}
