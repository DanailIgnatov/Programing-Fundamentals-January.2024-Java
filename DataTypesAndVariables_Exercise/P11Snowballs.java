package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = 0;
        int snowballSnowBiggest = 0;
        int snowballTTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int number = 1; number <= n; number++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow * 1.0 / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballTTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest, snowballTTimeBiggest, maxValue, snowballQualityBiggest);


    }
}
