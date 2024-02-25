package MidExam180224;

import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	budget - a floating-point number in the range [0.00…1000.00]
        //•	students - an integer in the range [0…100]
        //•	price for a package of flour - a floating-point number in the range [0.00…100.00]
        //•	price for a single egg - a floating-point number in the range [0.00…100.00]
        //•	price for a single apron - a floating-point number in the range [0.00…100.00]
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double packedOfFlourPrice = Double.parseDouble(scanner.nextLine());
        double singleEggPrice = Double.parseDouble(scanner.nextLine());
        double singeApronPrice = Double.parseDouble(scanner.nextLine());

        int freeFlour = students / 5;
        double priceFlour = (students - freeFlour) * packedOfFlourPrice;
        double priceEgges = students * 10 * singleEggPrice;
        double priceAprons = Math.ceil(students * 1.2) * singeApronPrice;

        double totalPrice = priceEgges + priceAprons + priceFlour;

        if (totalPrice <= budget) {
            System.out.printf("Items purchased for %.2f$.", totalPrice);
        } else {
            double neededMoney = totalPrice - budget;
            System.out.printf("%.2f$ more needed.", neededMoney);
        }
    }
}
