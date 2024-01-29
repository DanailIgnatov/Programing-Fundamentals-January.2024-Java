package ArraysExercise;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersArr = scanner.nextLine().split(" ");

        int rotations = Integer.parseInt(scanner.nextLine());


        for (int rotation = 1; rotation <= rotations; rotation++) {
            String firstNumber = (numbersArr[0]);
            for (int symbol = 0; symbol < numbersArr.length - 1; symbol++) {

                numbersArr[symbol] = numbersArr[symbol + 1];

            }
            numbersArr[numbersArr.length - 1] = firstNumber;
        }
        for (String element : numbersArr) {
            System.out.print(element + " ");
        }
    }
}
