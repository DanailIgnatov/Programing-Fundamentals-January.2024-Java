package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int column = 1; column <= n ; column++) {
            for (int row = 1; row <= column ; row++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
