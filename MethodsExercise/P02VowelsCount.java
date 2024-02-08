package MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        int countVowels = getVowelsCount(text);

        System.out.println(countVowels);
    }

    public static int getVowelsCount(String text) {

        int countVowels = 0;

        for (char letter : text.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                countVowels++;
            }
        }
        return countVowels;
    }
}
