package MidExam04;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kiloFood = Double.parseDouble(scanner.nextLine());
        double kiloHay = Double.parseDouble(scanner.nextLine());
        double kiloCover = Double.parseDouble(scanner.nextLine());
        double kiloGuinea = Double.parseDouble(scanner.nextLine());

        for (int day = 1; day <= 30; day++) {
            kiloFood -= 0.300;
            if (day % 2 == 0) {
                double restOfFood = kiloFood * 0.05;
                kiloHay -= restOfFood;
            }
            if (day % 3 == 0) {
                kiloCover -= kiloGuinea / 3;
            }
            if (kiloCover <= 0 || kiloFood <= 0 || kiloHay <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", kiloFood, kiloHay, kiloCover);
    }
}
