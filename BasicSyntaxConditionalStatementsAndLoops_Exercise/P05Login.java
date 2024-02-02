package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0 ; position--) {
            password += userName.charAt(position);
        }
        int incorrectPasswordCount = 0;
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)) {

            incorrectPasswordCount++;
            if (incorrectPasswordCount == 4) {
                System.out.printf("User %s blocked!", userName);
                return;
            }
            System.out.println("Incorrect password. Try again.");

            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", userName);
    }
}
