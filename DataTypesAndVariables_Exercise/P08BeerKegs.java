package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String biggerKeg = "";
        double maxVolume = Double.MIN_VALUE;

        for (int interval = 1; interval <= n; interval++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;
            if (volume > maxVolume) {
                biggerKeg = model;
                maxVolume = volume;
            }
        }
        System.out.println(biggerKeg);
    }
}
