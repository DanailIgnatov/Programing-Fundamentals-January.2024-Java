package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int countOfTarget = 0;
        int startPower = power;
        while (power >= distance) {

            power -= distance;
            countOfTarget++;

            if (power == startPower / 2) {
                if (factor != 0) {
                    power /= factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countOfTarget);
    }
}
