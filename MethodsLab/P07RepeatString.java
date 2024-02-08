package MethodsLab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textToRepeat = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());

        String finalText = buildText(textToRepeat, countRepeat);

        System.out.println(finalText);
    }

    public static String buildText(String text, int count) {
        String buildText = "";

        for (int i = 1; i <= count; i++) {
            buildText += text;
        }
        return buildText;
    }
}
