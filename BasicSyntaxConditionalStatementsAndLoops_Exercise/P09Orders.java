package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int orders = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int countOfOrders = 1; countOfOrders <= orders ; countOfOrders++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double price = ((days * capsulesCount) * pricePerCapsule);
            totalPrice += price;
            System.out.printf("The price for the coffee is: $%.2f%n", price);

        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
