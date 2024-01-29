package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int liters = 0;
        for (int line = 1; line <= n; line++) {

            int input = Integer.parseInt(scanner.nextLine());
            liters += input;
            if (liters > 255) {
                System.out.println("Insufficient capacity!");
                liters -= input;
            }
        }
        System.out.println(liters);
    }
}
