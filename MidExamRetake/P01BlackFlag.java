package MidExamRetake;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfThePlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;
        for (int days = 1; days <= daysOfThePlunder; days++) {
            totalPlunder += dailyPlunder;

            if (days % 3 == 0) {
                double extraPlunder = 0.5 * dailyPlunder;
                totalPlunder += extraPlunder;
            }
            if (days % 5 == 0) {
                totalPlunder = totalPlunder * 0.7;
            }

        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percentLeft = (totalPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentLeft);
        }
    }
}
