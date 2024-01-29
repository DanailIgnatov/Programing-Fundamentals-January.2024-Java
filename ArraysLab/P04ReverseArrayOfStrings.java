package ArraysLab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lettersArr = scanner.nextLine().split(" ");

        for (int i = lettersArr.length - 1; i >= 0; i--) {
            System.out.print(lettersArr[i] + " ");
        }
    }
}
