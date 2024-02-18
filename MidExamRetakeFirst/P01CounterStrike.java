package MidExamRetakeFirst;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int wons = 0;

        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);
            if (power >= distance) {
                power -= distance;
                wons++;
                if (wons % 3 == 0) {
                    power += wons;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wons, power);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wons,power);
    }
}
