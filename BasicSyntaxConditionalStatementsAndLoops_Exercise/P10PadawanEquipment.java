package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
        //•	The count of students – integer in the range [0…100].
        //•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
        //•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
        //•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double freeBelts = Math.floor(countOfStudents * 1.0 / 6);
        double countOfLightsabers = (Math.ceil(countOfStudents * 1.10));

        double totalPrice = priceOfLightsabers * countOfLightsabers + (priceOfRobes * countOfStudents) +
                priceOfBelts * (countOfStudents - freeBelts);

        if (amountOfMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - amountOfMoney);
        }
    }
}
