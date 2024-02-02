package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	On the first input line - lost games count – integer in the range [0, 1000].
        //•	On the second line – headset price - the floating-point number in the range [0, 1000].
        //•	On the third line – mouse price - the floating-point number in the range [0, 1000].
        //•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
        //•	On the fifth line – display price - the floating-point number in the range [0, 1000].
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;
        for (int games = 1; games <= lostGames; games++) {

            if (games % 2 == 0) {
                totalPrice += headsetPrice;
            }
            if (games % 3 == 0) {
                totalPrice += mousePrice;
            }
            if (games % 6 == 0) {
                totalPrice += keyboardPrice;
            }
            if (games % 12 == 0) {
                totalPrice += displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
