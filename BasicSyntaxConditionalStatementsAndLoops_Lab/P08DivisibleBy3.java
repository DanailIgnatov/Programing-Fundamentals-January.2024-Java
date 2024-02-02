package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P08DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int number = 1; number <= 100 ; number++) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
