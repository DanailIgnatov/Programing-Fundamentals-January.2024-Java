package MidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String jump = scanner.nextLine();

        int house = 0;

        while (!jump.equals("Love!")) {

            int jumpToHouse = Integer.parseInt(jump.split(" ")[1]);

            house += jumpToHouse;
            if (jumpToHouse > houses.size() - 1 || house > houses.size() - 1) {
                house = 0;
            }
            int hearts = houses.get(house);
            if (hearts == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", house);
            }
            if (hearts > 0) {
                hearts -= 2;
                houses.set(house, hearts);
                if (hearts == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", house);
                }
            }
            jump = scanner.nextLine();
        }
        int failed = 0;
        for (Integer home : houses) {
            if (home > 0) {
                failed++;
            }
        }
        if (failed == 0) {
            System.out.printf("Cupid's last position was %d.%n", house);
            System.out.println("Mission was successful.");
            return;
        }
        System.out.printf("Cupid's last position was %d.%n", house);
        System.out.printf("Cupid has failed %d places.%n", failed);
    }
}
