package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfGroup = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (group.equals("Students")) {

            switch (dayOfWeek) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
            if (countOfGroup >= 30) {
                price = price - price * 0.15;
            }
        } else if (group.equals("Business")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }
            if (countOfGroup >= 100) {
                countOfGroup -= 10;
            }
        } else if (group.equals("Regular")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
            if (countOfGroup >= 10 && countOfGroup <= 20) {
                price = price - price * 0.05;
            }
        }
        double totalPrice = price * countOfGroup;

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
